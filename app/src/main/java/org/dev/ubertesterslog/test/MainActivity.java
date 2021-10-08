package org.dev.ubertesterslog.test;

import android.os.Bundle;

import org.dev.ubertesterslog.Init;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init.start();
    }
}