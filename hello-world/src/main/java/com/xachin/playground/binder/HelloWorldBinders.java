package com.xachin.playground.binder;

import android.databinding.BindingAdapter;
import android.widget.TextView;

public class HelloWorldBinders {

    @BindingAdapter("globes")
    public static void setGlobes(TextView textView, int globes) {
        StringBuilder globesText = new StringBuilder();
        for (int i = 0; i < globes + 1; i++) {
            globesText.append("🌏");
        }
        textView.setText(globesText.toString());
    }

}
