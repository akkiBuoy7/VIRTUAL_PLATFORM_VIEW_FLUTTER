package com.example.virtual_web_view

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine

class MainActivity : FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        flutterEngine
            .platformViewsController
            .registry
            .registerViewFactory("plugins.codingwithtashi/flutter_web_view",
                WebViewFactory(flutterEngine.dartExecutor.binaryMessenger))
    }
}