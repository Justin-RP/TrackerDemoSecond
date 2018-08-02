package com.trackerdemo.activity;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class SettingsActivity extends Activity{

    Switch sSound, sVibration, sFlash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        sSound = (Switch)findViewById(R.id.sSound);
        sVibration = (Switch)findViewById(R.id.sVibration);
        sFlash = (Switch)findViewById(R.id.sFlash);

        sSound.setChecked(MainActivity.getInstance().bluetooth_sound_settings);
        sSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.getInstance().bluetooth_sound_settings = !MainActivity.getInstance().bluetooth_sound_settings;
                sSound.setChecked(MainActivity.getInstance().bluetooth_sound_settings);
            }
        });

        sVibration.setChecked(MainActivity.getInstance().bluetooth_sound_settings);
        sVibration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.getInstance().bluetooth_vibration_settings = !MainActivity.getInstance().bluetooth_vibration_settings;
                sVibration.setChecked(MainActivity.getInstance().bluetooth_vibration_settings);
            }
        });

        sFlash.setChecked(MainActivity.getInstance().bluetooth_flash_settings);
        sFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.getInstance().bluetooth_flash_settings = !MainActivity.getInstance().bluetooth_flash_settings;
                sFlash.setChecked(MainActivity.getInstance().bluetooth_flash_settings);
            }
        });




    }
}
