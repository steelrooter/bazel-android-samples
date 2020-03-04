package com.xachin.playground.clock;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public interface ClockViewModel {

    ObservableField<String> getTime();

    ObservableInt getFormatNumber();

    void changeTimeFormat();

}
