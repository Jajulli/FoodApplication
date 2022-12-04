package com.example.responsi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class Layout2 extends AppCompatActivity {
    TextView hello;
    RecyclerView daftarmenu;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<DaftarMenu> listMenu;

    void dataDummy(){
        listMenu = new ArrayList<>();
        listMenu.add(new DaftarMenu(R.drawable.menu1, "Pizza","Pizza dengan isian daging dan papperoni"));
        listMenu.add(new DaftarMenu(R.drawable.menu2, "Fried Chicken","Fresh digoreng ketika dipesan"));
        listMenu.add(new DaftarMenu(R.drawable.menu3, "Indomie Goreng Jumbo","Cita rasa indomie yang membuat jatuh cinta"));
        listMenu.add(new DaftarMenu(R.drawable.menu4, "Beef Burger","Burger dengan isian patty sapi yang tebal"));
    }

    void data(){
        daftarmenu = findViewById(R.id.list);
        adapter = new Adapter(this,listMenu);
        layoutManager = new LinearLayoutManager(this);
        daftarmenu.setLayoutManager(layoutManager);
        daftarmenu.setAdapter(adapter);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        hello = findViewById(R.id.hello);
        dataDummy();data();
        Bundle data = getIntent().getExtras();
        if (data == null){
            return;
        }
        String user = data.getString("Username");
        hello.setText("Hello, " +user);
    }
}