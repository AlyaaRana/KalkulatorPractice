package com.example.kalkulatorpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class kalkulatorAritmtika extends AppCompatActivity {

    //List widget yg akan dikenakan aksi
    EditText nilaiA, nilaiB;
    Button btnTambah, btnKurang,btnKali,btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_aritmtika);
        // konek komponen
        nilaiA = (EditText) findViewById(R.id.nilaiA);
        nilaiB = (EditText) findViewById(R.id.nilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angkaSatu =Integer.parseInt(nilaiA.getText().toString());
                int angkaDua = Integer.parseInt(nilaiB.getText().toString());
                int hasil = angkaSatu + angkaDua;
                Toast.makeText(getApplicationContext(),"hasil : " + hasil, Toast.LENGTH_SHORT).show();
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angkaSatu =Integer.parseInt(nilaiA.getText().toString());
                int angkaDua = Integer.parseInt(nilaiB.getText().toString());
                int hasil = angkaSatu - angkaDua;
                Toast.makeText(getApplicationContext(),"hasil : " + hasil, Toast.LENGTH_SHORT).show();

            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angkaSatu =Integer.parseInt(nilaiA.getText().toString());
                int angkaDua = Integer.parseInt(nilaiB.getText().toString());
                int hasil = angkaSatu * angkaDua;
                Toast.makeText(getApplicationContext(),"hasil : " + hasil, Toast.LENGTH_SHORT).show();
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((nilaiA.getText().length()>0) && nilaiB.getText().length()>0){
                    double angkaSatu = Integer.parseInt(nilaiA.getText().toString());
                    double angkaDua = Integer.parseInt(nilaiB.getText().toString());
                    double hasil = angkaSatu / angkaDua;
                    Toast.makeText(getApplicationContext(), "Hasil : " + new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Tolong Masukan Angka", Toast.LENGTH_SHORT).show();

                }
            }
         });
    }
}