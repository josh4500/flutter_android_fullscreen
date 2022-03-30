package com.example.fullscreen_test

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.TransparencyMode


class MainActivity: FlutterActivity() {
    @TargetApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val window: Window = this.activity.getWindow()

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView)

        windowInsetsController?.setAppearanceLightNavigationBars(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                var UI_OPTIONS = View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                window.getDecorView().setSystemUiVisibility(UI_OPTIONS)
            }
        }

    }
    override fun getTransparencyMode(): TransparencyMode {
        return TransparencyMode.transparent
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            val decorView: View = this.activity.getWindow().getDecorView()
            decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        }
    }


}
