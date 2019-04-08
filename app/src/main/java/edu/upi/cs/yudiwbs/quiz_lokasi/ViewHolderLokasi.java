package edu.upi.cs.yudiwbs.quiz_lokasi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolderLokasi extends RecyclerView.ViewHolder {

    public TextView lokasi;

    public ViewHolderLokasi(@NonNull View itemView) {
        super(itemView);
        lokasi = itemView.findViewById(R.id.lokasi);
    }
}
