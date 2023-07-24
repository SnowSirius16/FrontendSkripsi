package com.example.frontendskripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class catatanTertambah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan_tertambah);

        TextView tv = findViewById(R.id.tvJudul);
        ImageButton ib = findViewById(R.id.ibLainnya);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(catatanTertambah.this, HalamanCatatan.class);
                startActivity(it);
            }
        });
    }
}