package com.example.sembarabf;

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



public class PersegiActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    EditText sisi;
    Button hasil,keliling;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        this.setTitle("Persegi");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
//        setupTabIcons();

        sisi = findViewById(R.id.txtsisi);
        hasil = findViewById(R.id.btn_hitung);
        keliling = findViewById(R.id.btn_keliling);
        tvResult = findViewById(R.id.tvresult);
        sisi.addTextChangedListener(loginTextWatcher);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = sisi.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("")) {
                    sisi.setError("Masukan angka");
                } else{
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer hasil = angka1 * angka1;

                    tvResult.setText(String.valueOf(hasil));
                }
            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = sisi.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("")) {
                    sisi.setError("Masukan angka");
                } else{
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer hasil = 4 * angka1;

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
            String username = sisi.getText().toString().trim();


            if(!username.isEmpty()) {
                hasil.getBackground().setColorFilter(hasil.getContext().getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
                keliling.getBackground().setColorFilter(keliling.getContext().getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
            }
            else{
                hasil.getBackground().setColorFilter(hasil.getContext().getResources().getColor(R.color.abbu), PorterDuff.Mode.MULTIPLY);
                keliling.getBackground().setColorFilter(keliling.getContext().getResources().getColor(R.color.abbu), PorterDuff.Mode.MULTIPLY);

            }
        }

        @Override
        public void afterTextChanged(Editable editable) {


        }
    };
}
