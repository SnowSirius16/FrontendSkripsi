package com.example.frontendskripsi;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Menu {
    public String menu;
    public String stand;
    public String harga;
    public String kalori;
    public int gambar;
    ImageView ivMenu;

    public Menu(String m, String s, String h, String k, int g) {
        this.menu = m;
        this.stand = s;
        this.harga = h;
        this.kalori = k;
        this.gambar = g;
    }

    public void gambarMakanan() {
        if (this.gambar >= 0) {
            ivMenu.findViewById(R.id.ivMenu);
            ivMenu.setImageResource(R.drawable.ayam_goreng);
        }
    }
}
