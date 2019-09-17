package com.example.retrofit_app.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit_app.R;

public class DataViewHolder extends RecyclerView.ViewHolder{
    TextView nametxt, emailtxt, websitetxt, phonetxt;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);
        nametxt = itemView.findViewById(R.id.name);
        emailtxt = itemView.findViewById(R.id.email);
        phonetxt = itemView.findViewById(R.id.phone);
        websitetxt = itemView.findViewById(R.id.website);
    }
}
