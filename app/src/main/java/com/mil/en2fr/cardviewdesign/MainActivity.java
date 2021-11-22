package com.mil.en2fr.cardviewdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    ArrayList<DataModel> dataModels=new ArrayList<>();
    DataModel model=new DataModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        adapter=new RecyclerAdapter(MainActivity.this,dataModels);
        model.setBookMark(R.drawable.ic_baseline_bookmark_24);
        model.setFav(R.drawable.ic_baseline_favorite_24);
        model.setShare(R.drawable.ic_baseline_share_24);
        model.setMainImg(R.drawable.book);
        model.setHeading("Aliquet Et \\nAnte");
        dataModels.add(model);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);
    }
}