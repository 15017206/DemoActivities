package com.example.a15017206.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

        Button btnDone = (Button) findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText etName = (EditText) findViewById(R.id.editText);
                EditText etAge = (EditText) findViewById(R.id.editText2);

                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                Intent i = new Intent(DemoActivities.this, DemoActivities2.class);

                i.putExtra("info", info);

                startActivity(i);
            }
        });
    }
}
