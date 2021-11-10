package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.gridView);
        grid.setAdapter(new ImageAdapter(this));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getBaseContext(), "Car Model " + (position+1), Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(), "Cost For Rental: $199 " , Toast.LENGTH_LONG).show();
                Intent i = new Intent (getApplicationContext(), SingleViewActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });
            ;


    }
}