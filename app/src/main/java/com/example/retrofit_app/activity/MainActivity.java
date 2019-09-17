package com.example.retrofit_app.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofit_app.R;
import com.example.retrofit_app.adapter.RecylerviewAdapter;
import com.example.retrofit_app.model.Company;
import com.example.retrofit_app.model.Response;
import com.example.retrofit_app.model.User;
import com.example.retrofit_app.rest.ApiClient;
import com.example.retrofit_app.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);
        recyclerView = findViewById(R.id.recylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getData();


    }

    void getData() {
        Call<List<User>> call = apiInterface.getUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, retrofit2.Response<List<User>> response) {
                showIt(response.body());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });





//    private void showIt(List<User> response) {
//        RecylerviewAdapter adapter = new RecylerviewAdapter(response,getApplicationContext());
//        recyclerView.setAdapter(adapter);
//    }

    }

    private void showIt(List<User> response) {
        RecylerviewAdapter adapter = new RecylerviewAdapter(response,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

}
