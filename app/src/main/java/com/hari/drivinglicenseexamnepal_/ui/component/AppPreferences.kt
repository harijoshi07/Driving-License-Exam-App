package com.hari.drivinglicenseexamnepal_.ui.component

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

object AppPreferences {
    private const val PREFS_NAME = "app_prefs"
    private const val KEY_FIRST_LAUNCH = "key_first_launch"

    private fun getPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun isFirstLaunch(context: Context): Boolean {
        return getPreferences(context).getBoolean(KEY_FIRST_LAUNCH, true)
    }

    fun setFirstLaunchDone(context: Context) {
        getPreferences(context).edit { putBoolean(KEY_FIRST_LAUNCH, false) }
    }
}