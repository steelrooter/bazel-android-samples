package com.xachin.playground.hello_world

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.xachin.playground.clock.ClockViewModel
import com.xachin.playground.clock.ClockViewModelImpl
import com.xachin.playground.hello_world.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private val clockViewModel: ClockViewModel =
        ClockViewModelImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this,
                R.layout.activity_main
            )
        binding.vm = clockViewModel
    }
}
