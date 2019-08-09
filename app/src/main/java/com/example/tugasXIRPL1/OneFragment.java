package com.example.tugasXIRPL1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class OneFragment extends Fragment {

    EditText txtangka1;
    EditText txtangka2;
    CardView btntambah;
    CardView btnkali;
    CardView btnkurang;
    CardView btnbagi;
    TextView tvresult;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =   inflater.inflate(R.layout.fragment_one, container, false);
        txtangka1 = view.findViewById(R.id.txtangka1);
        txtangka2 = view.findViewById(R.id.txtangka2);
        btntambah = view.findViewById(R.id.plus);
        btnkurang = view.findViewById(R.id.minus);
        btnkali = view.findViewById(R.id.kali);
        btnbagi = view.findViewById(R.id.bagi);
        tvresult = view.findViewById(R.id.tvresult);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                }
                else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 + angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                } else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 - angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                } else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 * angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                } else if (inputAngka1.equalsIgnoreCase("0") && inputAngka2.equalsIgnoreCase("0")) {
                    txtangka2.setError("Angka tidak boleh 0");
                    txtangka1.setError("Angka tidak boleh 0");
                } else if (inputAngka1.equalsIgnoreCase("0") ) {
                    txtangka1.setError("Angka tidak boleh 0");
                }else if (inputAngka2.equalsIgnoreCase("0") ) {
                    txtangka2.setError("Angka tidak boleh 0");
                }

                else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 / angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });
        return view;
    }
}
