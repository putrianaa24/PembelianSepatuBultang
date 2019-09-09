package com.example.tugas6_keterampilan;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

abstract class ListSepatuAdapter extends RecyclerView.Adapter<ListSepatuAdapter.ListViewHolder>{
    private ArrayList<DataSepatu> listSepatu;
    private DataSepatu dataSepatu;

    public ListSepatuAdapter(ArrayList<DataSepatu> list) {
        this.listSepatu = list; }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_sepatu, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final DataSepatu dataLaptop =listSepatu.get(position);
        Glide.with(holder.itemView.getContext()).load(dataLaptop.getFoto())
                .apply(new RequestOptions())
                .into(holder.fotoSepatu);

        holder.namaSepatu.setText(dataLaptop.getNama());
        holder.tambahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Pembelian.class);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listSepatu.size(); }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoSepatu;
        TextView namaSepatu;
        Button tambahButton;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoSepatu = itemView.findViewById(R.id.foto_sepatu);
            namaSepatu = itemView.findViewById(R.id.nama_sepatu);
            tambahButton = itemView.findViewById(R.id.tambah); }

    }
}