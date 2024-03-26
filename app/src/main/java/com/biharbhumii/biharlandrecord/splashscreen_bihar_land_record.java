package com.biharbhumii.biharlandrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class splashscreen_bihar_land_record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_bihar_land_record);
        getSupportActionBar().hide();
    }

    public void gotomain(View view) {
        // Proceed to main activity
        Intent i = new Intent(splashscreen_bihar_land_record.this, dashboard_bihar_land_reports.class);
        startActivity(i);
    }
}