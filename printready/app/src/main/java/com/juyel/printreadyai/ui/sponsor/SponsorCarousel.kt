package com.juyel.printreadyai.ui.sponsor

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Sponsor image carousel for product cards (FLOW / AI / TOOLS).
 * 
 * Behavior:
 *   - Fetches image URLs from SponsorCarouselRepository (jsDelivr CDN)
 *   - If URLs available: shows them in a HorizontalPager with auto-scroll
 *   - If no URLs (network down / 404 / error / empty): shows bundled fallback drawable
 *   - Each image load failure silently falls back to the bundled drawable
 * 
 * @param prefix  "flow", "ai", or "tools"
 * @param fallbackDrawable  bundled drawable to show when remote images unavailable
 */
@Composable
fun SponsorCarousel(
    prefix: String,
    @DrawableRes fallbackDrawable: Int,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var imageUrls by remember { mutableStateOf<List<String>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }
    
    // Fetch URLs on first composition
    LaunchedEffect(prefix) {
        imageUrls = SponsorCarouselRepository.getImageUrls(context, prefix)
        isLoading = false
    }
    
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(160.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.Black.copy(alpha = 0.1f)),
        contentAlignment = Alignment.Center
    ) {
        if (isLoading) {
            // Loading state — show fallback immediately for better UX
            Image(
                painter = painterResource(fallbackDrawable),
                contentDescription = "Sponsor",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        } else if (imageUrls.isEmpty()) {
            // No network / no images / fetch failed — fallback
            Image(
                painter = painterResource(fallbackDrawable),
                contentDescription = "Sponsor",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        } else {
            // Have remote images — show carousel
            ImageCarousel(
                urls = imageUrls,
                fallbackDrawable = fallbackDrawable
            )
        }
    }
}

/**
 * HorizontalPager carousel with auto-scroll and page indicators.
 */
@Composable
private fun ImageCarousel(
    urls: List<String>,
    @DrawableRes fallbackDrawable: Int,
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(pageCount = { urls.size })
    val coroutineScope = rememberCoroutineScope()
    
    // Auto-scroll every 5 seconds
    LaunchedEffect(pagerState) {
        while (true) {
            delay(5000L)
            val nextPage = (pagerState.currentPage + 1) % urls.size
            pagerState.animateScrollToPage(
                page = nextPage,
                animationSpec = tween(durationMillis = 600)
            )
        }
    }
    
    Box(modifier = modifier.fillMaxSize()) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            RemoteImageWithFallback(
                url = urls[page],
                fallbackDrawable = fallbackDrawable
            )
        }
        
        // Page indicators (only show if more than 1 image)
        if (urls.size > 1) {
            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                repeat(urls.size) { index ->
                    val isActive = pagerState.currentPage == index
                    Box(
                        modifier = Modifier
                            .size(if (isActive) 8.dp else 6.dp)
                            .clip(CircleShape)
                            .background(
                                if (isActive) Color.White 
                                else Color.White.copy(alpha = 0.4f)
                            )
                    )
                }
            }
        }
    }
}

/**
 * Single image that loads from URL via Coil.
 * If load fails for any reason (404, network error, etc), shows bundled fallback.
 * User never sees an error state — only image or fallback.
 */
@Composable
private fun RemoteImageWithFallback(
    url: String,
    @DrawableRes fallbackDrawable: Int,
    modifier: Modifier = Modifier
) {
    var loadFailed by remember(url) { mutableStateOf(false) }
    val context = LocalContext.current
    
    if (loadFailed) {
        Image(
            painter = painterResource(fallbackDrawable),
            contentDescription = "Sponsor",
            contentScale = ContentScale.Crop,
            modifier = modifier.fillMaxSize()
        )
    } else {
        AsyncImage(
            model = ImageRequest.Builder(context)
                .data(url)
                .crossfade(true)
                .build(),
            contentDescription = "Sponsor",
            contentScale = ContentScale.Crop,
            modifier = modifier.fillMaxSize(),
            onError = { loadFailed = true },
            onSuccess = { /* success — image displayed */ }
        )
    }
}
