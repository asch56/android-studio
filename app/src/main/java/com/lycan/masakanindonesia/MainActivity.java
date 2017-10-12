package com.bagas.masakanindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] n_resep,deskripsi;
    int[] Img_res={R.drawable.g5,R.drawable.g8,R.drawable.g3,R.drawable.g6,R.drawable.g7,R.drawable.g1,R.drawable.g4,R.drawable.g12,R.drawable.g11,R.drawable.g13,R.drawable.g14,R.drawable.g9,R.drawable.g2,R.drawable.g10};
    ArrayList<Dataprovider> arrayList=new ArrayList<Dataprovider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        n_resep=getResources().getStringArray(R.array.nama_resep);
        deskripsi=getResources().getStringArray(R.array.desc);
        int i= 0;
        for (String name:n_resep){
            Dataprovider dataprovider=new Dataprovider(Img_res[i],name,deskripsi[i]);
            arrayList.add(dataprovider);
            i++;
        }

        adapter=new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
