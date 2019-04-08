package edu.upi.cs.yudiwbs.quiz_lokasi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterLokasi extends RecyclerView.Adapter<ViewHolderLokasi> {

    ArrayList<Lokasi> alLokasi;

    @NonNull
    @Override
    public ViewHolderLokasi onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolderLokasi(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLokasi vhLok, int i) {
        Lokasi l = alLokasi.get(i);
        vhLok.lokasi.setText(l.getLokasi());
    }

    @Override
    public int getItemCount() {
        return alLokasi.size();
    }

    public AdapterLokasi(ArrayList<Lokasi> alLokasi) {
        this.alLokasi = alLokasi;
    }
}
