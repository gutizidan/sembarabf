package com.example.sembarabf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class pilih extends AppCompatActivity {
    CardView materialtabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih);
        materialtabs = findViewById(R.id.materialtab);
        materialtabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(m);
            }
        });
    }
}
