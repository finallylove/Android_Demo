package com.mk.demo.myapplication;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class SettingsTestActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Settings.System.putString(getContentResolver(), "settingsTest", "lalalala");
        mTextView.setText(Settings.System.getString(getContentResolver(), "SettingsTest"));
    }
}
