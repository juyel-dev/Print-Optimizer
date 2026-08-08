package com.juyel.printreadyai.infra

import android.os.Bundle
import com.juyel.printreadyai.PrintReadyApp

object AnalyticsManager {
    private val analytics get() = PrintReadyApp.analytics
    
    fun logScreenView(screenName: String) {
        val params = Bundle().apply {
            putString("screen_name", screenName)
        }
        analytics.logEvent("screen_view", params)
    }
    
    fun logCtaClick(button: String, screen: String) {
        val params = Bundle().apply {
            putString("button_name", button)
            putString("screen_name", screen)
        }
        analytics.logEvent("cta_click", params)
    }
    
    fun logFilterUsed(filter: String, value: Any) {
        val params = Bundle().apply {
            putString("filter_name", filter)
            putString("filter_value", value.toString())
        }
        analytics.logEvent("filter_used", params)
    }
    
    fun logError(context: String, message: String) {
        val params = Bundle().apply {
            putString("error_context", context)
            putString("error_message", message)
        }
        analytics.logEvent("app_error", params)
    }
    
    fun logEvent(name: String, params: Map<String, Any> = emptyMap()) {
        val bundle = Bundle()
        params.forEach { (k, v) -> bundle.putString(k, v.toString()) }
        analytics.logEvent(name, bundle)
    }
}
