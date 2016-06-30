package com.mk.demo.myapplication;

import android.Manifest;
import android.app.Activity;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class SettingsTestActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView= (TextView) findViewById(R.id.settings);
        Settings.System.putString(getContentResolver(), "settingsSystemTest1", "13212");
        mTextView.setText(Settings.System.getString(getContentResolver(), "settingsSystemTest1"));
    }
}
