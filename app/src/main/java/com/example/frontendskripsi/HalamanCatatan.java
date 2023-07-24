package com.example.frontendskripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HalamanCatatan extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_catatan);

        ((ImageButton) this.findViewById(R.id.ibSarapan))
                .setOnClickListener(this);
        ((ImageButton) this.findViewById(R.id.ibSnackPagi))
                .setOnClickListener(this);
        ((ImageButton) this.findViewById(R.id.ibMakanSiang))
                .setOnClickListener(this);

    }

    protected void onResume() {
        super.onResume();
        Intent intent = this.getIntent();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ibSarapan: {
                Intent intent = new Intent(this, CatatanHarian.class);
                startActivity(intent);
            }
            break;
            case R.id.ibSnackPagi: {
                Intent intent = new Intent(this, CatatanHarian.class);
                startActivity(intent);
            }
            break;
            case R.id.ibMakanSiang: {
                Intent intent = new Intent(this, CatatanHarian.class);
                startActivity(intent);
            }
            break;
        }
    }
}