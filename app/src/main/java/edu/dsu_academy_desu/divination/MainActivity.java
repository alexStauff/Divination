package edu.dsu_academy_desu.divination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView reading = (TextView)findViewById(R.id.start);
        reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reading = new Intent(MainActivity.this, presentActivity.class);
                startActivity(reading);
            }
        });
    }
}
