package com.example.tugas6_keterampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    Button pembelian;
    RecyclerView rvData;
    private ArrayList<DataSepatu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rvData = findViewById(R.id.id_sepatu);
        rvData.setHasFixedSize(true);

        list.addAll(DataSepatu2.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
        ListSepatuAdapter listSepatuAdapter = new ListSepatuAdapter(list) {
        };
        rvData.setAdapter(listSepatuAdapter);
    }
}
