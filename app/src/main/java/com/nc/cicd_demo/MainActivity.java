package com.nc.cicd_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dper.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
