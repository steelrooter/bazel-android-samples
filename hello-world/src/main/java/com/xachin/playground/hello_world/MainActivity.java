package com.xachin.playground.hello_world;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.xachin.playground.clock.ClockViewModel;
import com.xachin.playground.clock.ClockViewModelImpl;
import com.xachin.playground.hello_world.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ClockViewModel clockViewModel = new ClockViewModelImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVm(clockViewModel);
    }
}
