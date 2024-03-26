package com.biharbhumii.biharlandrecord;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dashboard_bihar_land_reports extends AppCompatActivity {
    TextView txtMarquee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_bihar_land_reports);
        getSupportActionBar().hide();
        // casting of textview
        txtMarquee = findViewById(R.id.marqueeText);

        // Now we will call setSelected() method
        // and pass boolean value as true
        txtMarquee.setSelected(true);

    }

    //Poshan Tracker
    public void BiharLandRecord(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, MainActivity.class);
        startActivity(i);
    }

    //OnlineDakhilKharij
    public void OnlineDakhilKharij(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, OnlineDakhilKharij_Bihar_land_Record.class);
        startActivity(i);
    }
    //Bhulagan_Bihar_Land_Record
    public void bhulgan_bihar(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, Bhulagan_Bihar_Land_Record.class);
        startActivity(i);
    }

    //contactus_Bihar_Land_Record
    public void contactus(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, contactus_Bihar_Land_Record.class);
        startActivity(i);
    }
    //Parimarjan_Bihar_Land_Record
    public void Parimarjan(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, Parimarjan_Bihar_Land_Record.class);
        startActivity(i);
    }
    //Jamabandi_Bihar_Land_Record
    public void Jamabandi(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, Jamabandi_Bihar_Land_Record.class);
        startActivity(i);
    }
    //map_Bihar_Land_Record
    public void map(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, map_Bihar_Land_Record.class);
        startActivity(i);
    }
    //About us page
    public void gotoabout(View view) {
        Intent i = new Intent(dashboard_bihar_land_reports.this, About_Bihar_Land_Record.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDilo = new AlertDialog.Builder(dashboard_bihar_land_reports.this);
        alertDilo.setTitle("Exit App...");
        alertDilo.setMessage("क्या आप ऐप से बाहर निकलना चाहते हैं");
        alertDilo.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        });
        alertDilo.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alertDilo.show();
    }
}
