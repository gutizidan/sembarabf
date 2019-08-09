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



public class PersegiPanjangActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    EditText panjang;
    EditText lebar;
    Button hitung,kaliling;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        this.setTitle("Persegi Panjang");


        panjang = findViewById(R.id.txtpanjang);
        lebar = findViewById(R.id.txtlebar);
        hitung = findViewById(R.id.btn_hitung);
        kaliling = findViewById(R.id.btn_keliling);
        tvResult = findViewById(R.id.tvresult);
        panjang.addTextChangedListener(loginTextWatcher);
        lebar.addTextChangedListener(loginTextWatcher);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPanjang = panjang.getText().toString().trim();
                String inputLebar = lebar.getText().toString().trim();

                if (inputPanjang.equalsIgnoreCase("") && inputLebar.equalsIgnoreCase("")) {
                    panjang.setError("Masukan angka");
                    lebar.setError("Masukan angka");}
                else if(inputPanjang.equalsIgnoreCase("")){
                    panjang.setError("Masukan angka");
                }
                else if(inputLebar.equalsIgnoreCase("")){
                    lebar.setError("Masukan angka");
                } else {
                    Integer panjang = Integer.parseInt(inputPanjang);
                    Integer lebar = Integer.parseInt(inputLebar);
                    Integer hasil = panjang*lebar;

                    tvResult.setText(String.valueOf(hasil));
                }
            }
        }); kaliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPanjang = panjang.getText().toString().trim();
                String inputLebar = lebar.getText().toString().trim();

                if (inputPanjang.equalsIgnoreCase("") && inputLebar.equalsIgnoreCase("")) {
                    panjang.setError("Masukan angka");
                    lebar.setError("Masukan angka");}
                else if(inputPanjang.equalsIgnoreCase("")){
                        panjang.setError("Masukan angka");
                    }
                else if(inputLebar.equalsIgnoreCase("")){
                        lebar.setError("Masukan angka");
                    }
                else {
                    Integer panjang = Integer.parseInt(inputPanjang);
                    Integer lebar = Integer.parseInt(inputLebar);
                    Integer hasil = (panjang + lebar) * 2;

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
            String username = panjang.getText().toString().trim();
            String username1= lebar.getText().toString().trim();


            if(!username.isEmpty()&&!username1.isEmpty()) {
                hitung.getBackground().setColorFilter(hitung.getContext().getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
                kaliling.getBackground().setColorFilter(kaliling.getContext().getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
            }
            else{
                hitung.getBackground().setColorFilter(hitung.getContext().getResources().getColor(R.color.abbu), PorterDuff.Mode.MULTIPLY);
                kaliling.getBackground().setColorFilter(kaliling.getContext().getResources().getColor(R.color.abbu), PorterDuff.Mode.MULTIPLY);

            }
        }

        @Override
        public void afterTextChanged(Editable editable) {


        }
    };
}
