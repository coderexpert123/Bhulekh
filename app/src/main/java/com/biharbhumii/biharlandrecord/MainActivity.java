package com.biharbhumii.biharlandrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        String[] stories_names = getResources().getStringArray(R.array.stories_name);
        getSupportActionBar().setTitle("Bihar Land Record");

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.row, R.id.row_textview, stories_names);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, show_bihar_land_record.class);
                intent.putExtra("story_key", i);
                startActivity(intent);
            }
        });
    }
}
