package com.example.frontendskripsi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter {
    private final Context ctx;
    private List<Menu> menus;

    public MenuAdapter(Context ctx, List<Menu> menus) {
        this.ctx = ctx;
        this.menus = menus;
    }

    class VHMenu extends RecyclerView.ViewHolder {

        private TextView tvMenu;
        private TextView tvStand;
        private TextView tvHarga;
        private ImageView ivMenu;


        public VHMenu(@NonNull View rowView) {
            super(rowView);
            this.tvMenu = rowView.findViewById(R.id.tvMenu);
            this.tvStand = rowView.findViewById(R.id.tvStand);
            this.tvHarga = rowView.findViewById(R.id.tvHarga);
            this.ivMenu = rowView.findViewById(R.id.ivMenu);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(this.ctx)
                .inflate(R.layout.list_menu, parent, false);
        return new VHMenu(rowView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VHMenu vh =(VHMenu) holder;
        Menu m = this.menus.get(position);

        vh.tvMenu.setText(m.menu);
        vh.tvStand.setText(m.stand);
        vh.tvHarga.setText(m.harga);
        //vh.ivMenu.setImageDrawable(m.gambarMakanan());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(view.getContext(), catatanTertambah.class);
                view.getContext().startActivity(it);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.menus.size();
    }
}
