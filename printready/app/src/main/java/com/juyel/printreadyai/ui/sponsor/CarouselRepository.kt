package com.juyel.printreadyai.ui.sponsor

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/**
 * Sponsor carousel image repository.
 * Fetches image list from jsDelivr (GitHub CDN) for the juyel-dev/image repo.
 * 
 * Naming convention: sponsors/{prefix}_{n}.jpg
 *   - prefix: "flow", "ai", "tools" (one per card)
 *   - n: 1, 2, 3... (up to 7)
 * 
 * If network is unavailable or fetch fails, returns empty list —
 * the composable will fall back to bundled drawable images.
 */
object SponsorCarouselRepository {
    
    private const val TAG = "SponsorCarousel"
    private const val JSDELIVR_API = "https://data.jsdelivr.com/v1/packages/gh/juyel-dev/image@main"
    private const val CDN_BASE = "https://cdn.jsdelivr.net/gh/juyel-dev/image@main"
    private const val MAX_IMAGES_PER_CARD = 7
    
    // In-memory cache (per prefix)
    private val cache = mutableMapOf<String, List<String>>()
    private var hasFetched = false
    
    /**
     * Get CDN URLs for a specific card prefix.
     * Returns empty list if fetch failed or no images found — UI will use bundled fallback.
     */
    suspend fun getImageUrls(context: Context, prefix: String): List<String> {
        // Check cache first
        cache[prefix]?.let { return it }
        
        // Check network
        if (!isNetworkAvailable(context)) {
            Log.d(TAG, "No network for prefix=$prefix, returning empty (fallback)")
            return emptyList()
        }
        
        // Fetch once per session
        if (!hasFetched) {
            fetchAndCache()
            hasFetched = true
        }
        
        return cache[prefix] ?: emptyList()
    }
    
    /**
     * Fetch file listing from jsDelivr and populate cache.
     */
    private suspend fun fetchAndCache() {
        withContext(Dispatchers.IO) {
            try {
                val url = URL(JSDELIVR_API)
                val conn = url.openConnection() as HttpURLConnection
                conn.connectTimeout = 5000
                conn.readTimeout = 5000
                conn.requestMethod = "GET"
                
                if (conn.responseCode != 200) {
                    Log.w(TAG, "jsDelivr API returned ${conn.responseCode}")
                    return@withContext
                }
                
                val response = conn.inputStream.bufferedReader().use { it.readText() }
                conn.disconnect()
                
                parseResponse(response)
                Log.d(TAG, "Fetched sponsor list: ${cache.mapValues { it.value.size }}")
                
            } catch (e: Exception) {
                Log.w(TAG, "Failed to fetch sponsors: ${e.message}")
            }
        }
    }
    
    /**
     * Parse jsDelivr API response and extract sponsor images by prefix.
     * 
     * Response structure (simplified):
     * {
     *   "files": [
     *     { "name": "LICENSE", "hash": "..." },
     *     { "name": "sponsors", "files": [
     *         { "name": "flow_1.jpg", "hash": "..." },
     *         { "name": "flow_2.jpg", "hash": "..." },
     *         ...
     *     ]}
     *   ]
     * }
     */
    private fun parseResponse(jsonStr: String) {
        try {
            val root = JSONObject(jsonStr)
            val files = root.optJSONArray("files") ?: return
            
            // Find "sponsors" directory
            var sponsorsDir: JSONObject? = null
            for (i in 0 until files.length()) {
                val f = files.getJSONObject(i)
                if (f.optString("name") == "sponsors") {
                    sponsorsDir = f
                    break
                }
            }
            
            if (sponsorsDir == null) {
                Log.d(TAG, "No 'sponsors' directory in repo")
                return
            }
            
            val sponsorFiles = sponsorsDir.optJSONArray("files") ?: return
            
            // Group by prefix: flow, ai, tools
            val prefixes = listOf("flow", "ai", "tools")
            val grouped = mutableMapOf<String, MutableList<Int>>()
            
            for (i in 0 until sponsorFiles.length()) {
                val name = sponsorFiles.getJSONObject(i).optString("name")
                // Match pattern: {prefix}_{n}.jpg
                val match = Regex("^(flow|ai|tools)_(\\d+)\\.jpg$").matchEntire(name) ?: continue
                val prefix = match.groupValues[1]
                val num = match.groupValues[2].toIntOrNull() ?: continue
                
                if (prefixes.contains(prefix)) {
                    grouped.getOrPut(prefix) { mutableListOf() }.add(num)
                }
            }
            
            // Build URL lists (sorted by number, capped at MAX_IMAGES_PER_CARD)
            for ((prefix, numbers) in grouped) {
                val urls = numbers.sorted()
                    .take(MAX_IMAGES_PER_CARD)
                    .map { "$CDN_BASE/sponsors/${prefix}_$it.jpg" }
                cache[prefix] = urls
            }
            
        } catch (e: Exception) {
            Log.w(TAG, "Failed to parse jsDelivr response: ${e.message}")
        }
    }
    
    /**
     * Check if device has active network connection.
     */
    private fun isNetworkAvailable(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = cm.activeNetwork ?: return false
        val caps = cm.getNetworkCapabilities(network) ?: return false
        return caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) &&
               caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED)
    }
    
    /**
     * Reset cache (for testing or manual refresh).
     */
    fun resetCache() {
        cache.clear()
        hasFetched = false
    }
}
