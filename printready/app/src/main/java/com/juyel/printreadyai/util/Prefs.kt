package com.juyel.printreadyai.util

import android.content.Context
import android.content.SharedPreferences

/** Thin SharedPreferences wrapper (own implementation). */
class Prefs(context: Context) {
    private val prefs: SharedPreferences =
        context.getSharedPreferences("printready_prefs", Context.MODE_PRIVATE)

    fun saveString(key: String, value: String) {
        prefs.edit().putString(key, value).apply()
    }

    fun getString(key: String, default: String = ""): String =
        prefs.getString(key, default) ?: default

    fun saveBoolean(key: String, value: Boolean) {
        prefs.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String, default: Boolean): Boolean =
        prefs.getBoolean(key, default)

    fun clear() {
        prefs.edit().clear().apply()
    }
}
