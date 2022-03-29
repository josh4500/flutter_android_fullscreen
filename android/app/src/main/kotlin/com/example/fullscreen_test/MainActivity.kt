package com.example.fullscreen_test

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.TransparencyMode
import io.flutter.embedding.engine.FlutterEngine


class MainActivity: FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val window: Window = this.activity.getWindow()

        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
    override fun getTransparencyMode(): TransparencyMode {
        return TransparencyMode.transparent
    }
}
