package com.example.tugasXIRPL1;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class segitiga extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    EditText alas,tinggi;
    Button hasil;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        this.setTitle("Segitiga");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
//        setupTabIcons();

        alas = findViewById(R.id.txtalas);
        tinggi = findViewById(R.id.txttinggi);
        hasil = findViewById(R.id.btn_hitung);
        tvResult = findViewById(R.id.tvresult);
        alas.addTextChangedListener(loginTextWatcher);
        tinggi.addTextChangedListener(loginTextWatcher);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = alas.getText().toString().trim();
                String inputAngka2 = tinggi.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    alas.setError("Masukan angka");
                    tinggi.setError("Masukan angka");}
                else if(inputAngka1.equalsIgnoreCase("")){
                    alas.setError("Masukan angka");
                }
                else if(inputAngka2.equalsIgnoreCase("")){
                    tinggi.setError("Masukan angka");
                }else{
                    double angka1 = Double.parseDouble(inputAngka1);
                    double angka2 = Double.parseDouble(inputAngka2);
                    double hasil = angka1 * angka2 / 2;

                    tvResult.setText(String.valueOf(hasil));
                }
            }
        });

    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String username = alas.getText().toString().trim();
            String username1 = tinggi.getText().toString().trim();


            if(!username.isEmpty()&&!username1.isEmpty()) {
                hasil.getBackground().setColorFilter(hasil.getContext().getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
            }
            else{
                hasil.getBackground().setColorFilter(hasil.getContext().getResources().getColor(R.color.abbu), PorterDuff.Mode.MULTIPLY);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {


        }
    };
}

