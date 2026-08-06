package com.notescrafter.utils;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2024f0;
import com.google.android.gms.internal.measurement.C2069n0;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class AnalyticsManager {
    private static final String TAG = "AnalyticsManager";
    private static FirebaseAnalytics firebaseAnalytics;
    public static final AnalyticsManager INSTANCE = new AnalyticsManager();
    public static final int $stable = 8;

    private AnalyticsManager() {
    }

    public final void initialize(Context context) {
        o.f(context, "context");
        try {
            firebaseAnalytics = FirebaseAnalytics.getInstance(context);
            Log.d(TAG, "Firebase Analytics Initialized");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize Firebase Analytics: " + e.getMessage());
        }
    }

    public final void logCtaClick(String buttonName, String screenName) {
        o.f(buttonName, "buttonName");
        o.f(screenName, "screenName");
        Bundle bundle = new Bundle();
        bundle.putString("item_name", buttonName);
        bundle.putString("screen_source", screenName);
        bundle.putString("content_type", "button");
        logEvent("cta_click", bundle);
        Log.d(TAG, "CTA Click: " + buttonName + " on " + screenName);
    }

    public final void logError(String errorName, String message) {
        o.f(errorName, "errorName");
        o.f(message, "message");
        Bundle bundle = new Bundle();
        bundle.putString("error_name", errorName);
        bundle.putString("error_message", message);
        logEvent("handled_error", bundle);
        Log.e(TAG, "Handled Error: " + errorName + " - " + message);
    }

    public final void logEvent(String eventName, Bundle bundle) {
        o.f(eventName, "eventName");
        FirebaseAnalytics firebaseAnalytics2 = firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            C2024f0 c2024f0 = firebaseAnalytics2.f10835a;
            c2024f0.getClass();
            c2024f0.f(new C2069n0(c2024f0, (String) null, eventName, bundle, false));
        }
    }

    public final void logFilterUsed(String filterName, boolean z3) {
        o.f(filterName, "filterName");
        Bundle bundle = new Bundle();
        bundle.putString("filter_name", filterName);
        bundle.putBoolean("enabled", z3);
        logEvent("filter_toggle", bundle);
    }

    public final void logScreenView(String screenName) {
        o.f(screenName, "screenName");
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", screenName);
        bundle.putString("screen_class", screenName);
        logEvent("screen_view", bundle);
        Log.d(TAG, "Screen View: ".concat(screenName));
    }
}
