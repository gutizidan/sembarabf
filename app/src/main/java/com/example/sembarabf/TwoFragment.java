package com.example.sembarabf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;




public class TwoFragment extends Fragment {

    CardView persegi;
    CardView persegipanjang;
    CardView segitiga;
    CardView lingkaran;

    public TwoFragment() {
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
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        persegi = view.findViewById(R.id.persegi);
        persegipanjang = view.findViewById(R.id.persegipanjang);
        segitiga = view.findViewById(R.id.segitiga1);
        lingkaran = view.findViewById(R.id.lingkaran);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), PersegiActivity.class);
                startActivity(in);
            }
        });

        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), PersegiPanjangActivity.class);
                startActivity(in);
            }
        });
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), segitiga.class);
                startActivity(in);
            }
        });
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), linggkaran.class);
                startActivity(in);
            }
        });
        return view;
    }

}
