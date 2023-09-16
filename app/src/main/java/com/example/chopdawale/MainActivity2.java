package com.example.chopdawale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button singup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        singup = findViewById(R.id.singup);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r;

                r = new Intent(MainActivity2.this, DashboardActivity.class);
                startActivity(r);
                getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
            }
        });

    }
}