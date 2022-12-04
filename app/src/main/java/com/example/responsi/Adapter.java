package com.example.responsi;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    final ImageView logo;
    final TextView nama;
    final TextView detail;

    public holder(@NonNull View itemView) {
        super(itemView);

        logo = itemView.findViewById(R.id.makan);
        nama = itemView.findViewById(R.id.menu);
        detail = itemView.findViewById(R.id.detail);
    }
}

    class Adapter extends RecyclerView.Adapter<holder> {
    final Context context;
    final ArrayList<DaftarMenu> listMenu;

    public Adapter(Context context, ArrayList<DaftarMenu> listMenu){
        this.context = context;
        this.listMenu = listMenu;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_list_item, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        DaftarMenu menu = listMenu.get(position);
        Log.d("debug", menu.getLogo()+"");
        holder.nama.setText(menu.getNama());
        holder.detail.setText(menu.getDetail());
        holder.logo.setImageResource(menu.getLogo());
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }
}
