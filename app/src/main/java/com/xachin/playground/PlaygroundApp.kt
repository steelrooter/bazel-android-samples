package com.xachin.playground

import android.app.Application
import android.util.Log

class PlaygroundApp : Application() {

    override fun onCreate() {
        Log.d("PlaygroundApp", "onCreate at " + System.currentTimeMillis())
        super.onCreate()
    }

}
