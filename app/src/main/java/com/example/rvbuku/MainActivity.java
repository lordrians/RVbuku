package com.example.rvbuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rvbuku.adapter.BookAdapter;
import com.example.rvbuku.model.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBuku;
    private ArrayList<Buku> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBuku = findViewById(R.id.rv_buku);
        rvBuku.setHasFixedSize(true);

        list.addAll(dtBuku.getListData());
        showRVBuku();
    }

    private void showRVBuku() {
        rvBuku.setLayoutManager(new LinearLayoutManager(this));
        BookAdapter bookAdapter = new BookAdapter(list);
        rvBuku.setAdapter(bookAdapter);
    }
}
