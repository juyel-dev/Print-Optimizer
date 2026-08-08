package com.juyel.printreadyai

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.FirebaseAnalytics

class PrintReadyApp : Application() {
    companion object {
        lateinit var analytics: FirebaseAnalytics
            private set
    }
    
    override fun onCreate() {
        super.onCreate()
        
        // Native lib load
        System.loadLibrary("printready-native")
        
        // Firebase init
        FirebaseApp.initializeApp(this)
        analytics = FirebaseAnalytics.getInstance(this)
        
        // Create PrintReadyFiles dir
        val dir = getExternalFilesDir(null)
        dir?.mkdirs()
    }
}
