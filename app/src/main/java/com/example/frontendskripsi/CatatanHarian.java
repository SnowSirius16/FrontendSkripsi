package com.example.frontendskripsi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CatatanHarian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan_harian);

        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("Tahu Telor", "Kantin 2 CL", "Rp 10.000", "2000 kal", 1));
        menus.add(new Menu("Mie Carbonara", "Kantin 1 CL", "Rp 15.000", "2100 kal", 2));
        menus.add(new Menu("Nasi Campur", "Kantin 2 Griya", "Rp 12.000", "2800 kal", 3));
        menus.add(new Menu("Omurice", "Kantin 5 CL", "Rp 15.000", "2400 kal", 4));
        menus.add(new Menu("Ramen Katsu", "Kantin 5 CL", "Rp 17.000", "2370 kal", 5));
        menus.add(new Menu("Soto", "Kantin 3 CL", "Rp 10.000", "1920 kal", 6));
        menus.add(new Menu("Lalapan Ayam", "Kantin 1 Griya", "Rp 10.000", "2200 kal", 7));

        MenuAdapter mAdapter =new MenuAdapter(this, menus);
        RecyclerView rvMenu = this.findViewById(R.id.rvMenu);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.setAdapter(mAdapter);


    }
}