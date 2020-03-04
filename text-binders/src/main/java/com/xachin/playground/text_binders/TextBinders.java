package com.xachin.playground.text_binders;

import android.databinding.BindingAdapter;
import android.widget.TextView;

public class TextBinders {

    @BindingAdapter("clockFaces")
    public static void setClockFaces(TextView textView, int clockFaces) {
        StringBuilder globesText = new StringBuilder();
        for (int i = 0; i < clockFaces + 1; i++) {
            globesText.append("🕰");
        }
        textView.setText(globesText.toString());
    }

}
