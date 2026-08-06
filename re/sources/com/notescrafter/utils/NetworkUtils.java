package com.notescrafter.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkUtils {
    public static final int $stable = 0;
    public static final NetworkUtils INSTANCE = new NetworkUtils();

    private NetworkUtils() {
    }

    public final boolean isInternetAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        o.f(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            o.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
        } catch (SecurityException e) {
            Log.e("NetworkUtils", "SecurityException during internet check: " + e.getMessage(), e);
            return true;
        } catch (Exception e3) {
            Log.e("NetworkUtils", "Exception during internet check: " + e3.getMessage(), e3);
            return true;
        }
    }
}
