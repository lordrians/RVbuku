package com.example.rvbuku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class detailActivity extends AppCompatActivity {
    TextView tvNamaBuku, tvWaktuTerbit, tvPublisher, tvRate, tvAuthor, tvGenre, tvDesc;
    ImageView ivPhoto;
    String gNama,gTime,gPublisher,gRate,gAuthor,gGenre,gDesc,gPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //isi variable
        tvNamaBuku = findViewById(R.id.tvDetailNama);
        tvWaktuTerbit = findViewById(R.id.tvDetailWaktuTerbit);
        tvPublisher = findViewById(R.id.tvDetailPublisher);
        tvRate = findViewById(R.id.tvDetailRate);
        tvAuthor = findViewById(R.id.tvDetailAuthor);
        tvGenre = findViewById(R.id.tvDetailGenre);
        tvDesc = findViewById(R.id.tvDetailDesk);
        ivPhoto = findViewById(R.id.ivDetailPhoto);

        gNama = getIntent().getStringExtra("putNama");
        gTime = getIntent().getStringExtra("putTime");
        gPublisher = getIntent().getStringExtra("putPublisher");
        gRate = getIntent().getStringExtra("putRate");
        gAuthor = getIntent().getStringExtra("putAuthor");
        gGenre = getIntent().getStringExtra("putGenre");
        gDesc = getIntent().getStringExtra("putDesc");
        gPhoto = getIntent().getStringExtra("putPhoto");
        Glide.with(this)
                .load(gPhoto)
                .apply(new RequestOptions()
                        .override(150,200).centerCrop())
                .into(ivPhoto);



        tvNamaBuku.setText(gNama);
        tvWaktuTerbit.setText(gTime);
        tvPublisher.setText(gPublisher);
        tvRate.setText(gRate);
        tvAuthor.setText(gAuthor);
        tvGenre.setText(gGenre);
        tvDesc.setText(gDesc);
//        fillContent();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
