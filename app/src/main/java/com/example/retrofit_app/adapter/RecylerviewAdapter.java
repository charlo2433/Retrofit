package com.example.retrofit_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit_app.R;
import com.example.retrofit_app.model.Address;
import com.example.retrofit_app.model.Company;
import com.example.retrofit_app.model.Response;
import com.example.retrofit_app.model.User;

import java.util.List;

public class RecylerviewAdapter extends RecyclerView.Adapter<DataViewHolder>{

    private List<User> list;
    private Context context;

    public RecylerviewAdapter(List<User> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        User user = list.get(position);
        holder.nametxt.setText(user.getName());
        holder.emailtxt.setText(user.getEmail());
        holder.websitetxt.setText(user.getWebsite());
        holder.phonetxt.setText(user.getPhone());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
