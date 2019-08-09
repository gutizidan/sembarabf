package com.example.tugasXIRPL1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class pilih extends AppCompatActivity {
    CardView materialtabs;
    CardView kalkulatorb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih);
        materialtabs = findViewById(R.id.materialtab);
        kalkulatorb = findViewById(R.id.kalkulatorb);
        materialtabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });
        kalkulatorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m =new Intent(getApplicationContext(), kalkulatorbiasa.class);
                startActivity(m);
            }
        });
    }
}
