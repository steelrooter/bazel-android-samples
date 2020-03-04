package com.xachin.playground.clock

import android.databinding.ObservableField
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ClockViewModelImpl : ClockViewModel {

    override val time: ObservableField<String> = ObservableField("")

    private val formats = listOf(
        "yyyy-MM-dd",
        "yyyy-MM-dd HH:mm:ss",
        "yyyy-MM-dd HH:mm:ss.SSSZ",
        "EEEE MMMM yyyy HH:mm:ss.SSSZ",
        "yyyy-MM-dd'T'HH:mm:ssZ"
    )

    private var currentFormat = 0

    init {
        updateTime()
    }

    override fun changeTimeFormat() {
        changeFormat()
        updateTime()
    }

    private fun changeFormat() {
        currentFormat++
        currentFormat %= formats.size
    }

    private fun updateTime() {
        val newTime = SimpleDateFormat(formats[currentFormat], Locale.US).format(Date())
        time.set(newTime)
    }

}
