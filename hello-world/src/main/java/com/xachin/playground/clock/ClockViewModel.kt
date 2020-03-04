package com.xachin.playground.clock

import android.databinding.ObservableField

interface ClockViewModel {

    val time: ObservableField<String>

    fun changeTimeFormat()

}
