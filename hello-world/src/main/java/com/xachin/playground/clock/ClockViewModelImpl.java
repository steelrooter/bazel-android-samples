package com.xachin.playground.clock;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ClockViewModelImpl implements ClockViewModel {

    private List<String> formats = Arrays.asList(
            "yyyy-MM-dd",
            "yyyy-MM-dd HH:mm:ss",
            "yyyy-MM-dd HH:mm:ss.SSSZ",
            "EEEE MMMM yyyy HH:mm:ss.SSSZ",
            "yyyy-MM-dd'T'HH:mm:ssZ"
    );

    private int currentFormat = 0;

    private ObservableField<String> observableTime = new ObservableField<>("");
    private ObservableInt observableFormatNumber = new ObservableInt(currentFormat);

    public ClockViewModelImpl() {
        updateTime();
    }

    @Override
    public ObservableField<String> getTime() {
        return observableTime;
    }

    @Override
    public ObservableInt getFormatNumber() {
        return observableFormatNumber;
    }

    @Override
    public void changeTimeFormat() {
        changeFormat();
        updateTime();
    }

    private void changeFormat() {
        currentFormat++;
        currentFormat %= formats.size();
        observableFormatNumber.set(currentFormat);
    }

    private void updateTime() {
        String newTime = new SimpleDateFormat(formats.get(currentFormat), Locale.US).format(new Date());
        observableTime.set(newTime);
    }

}
