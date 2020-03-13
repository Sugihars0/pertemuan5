package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    RecyclerView rvName;
    Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] name = {"andy","budi","tommy","Dika","Eli","Fani"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvName = findViewById(R.id.rv_name);

        rvName.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvName.setLayoutManager(layoutManager);

        adapter = new Adapter(name);
        rvName.setAdapter(adapter);
    }
}
