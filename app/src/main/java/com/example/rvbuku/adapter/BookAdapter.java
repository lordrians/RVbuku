package com.example.rvbuku.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.rvbuku.R;
import com.example.rvbuku.model.Buku;
import com.example.rvbuku.detailActivity;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ListViewHolder> {
    private ArrayList<Buku> listBuku;
    Context context;



    public BookAdapter(ArrayList<Buku> list, Context context) {
        this.listBuku = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_buku, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Buku buku = listBuku.get(position);
        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions().override(100,150).centerCrop())
                .into(holder.ivPhoto);
        holder.tvNamaBuku.setText(buku.getName());
        holder.tvWaktuTerbit.setText(buku.getTime());
        holder.tvPublisher.setText(buku.getPublisher());
        holder.tvRate.setText(buku.getRate());
        holder.tvAuthor.setText(buku.getAuthor());
        holder.tvGenre.setText(buku.getGenre());
        holder.LLItemBuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, detailActivity.class );
                intent.putExtra("putNama", listBuku.get(position).getName());
                intent.putExtra("putTime", listBuku.get(position).getTime());
                intent.putExtra("putPublisher", listBuku.get(position).getPublisher());
                intent.putExtra("putAuthor", listBuku.get(position).getAuthor());
                intent.putExtra("putGenre", listBuku.get(position).getGenre());
                intent.putExtra("putDesc", listBuku.get(position).getDesc());
                intent.putExtra("putRate", listBuku.get(position).getRate());
                intent.putExtra("putPhoto", listBuku.get(position).getPhoto());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listBuku.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaBuku, tvWaktuTerbit, tvPublisher, tvRate, tvAuthor, tvGenre, tvDesc;
        ImageView ivPhoto;
        LinearLayout LLItemBuku;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaBuku = itemView.findViewById(R.id.tvItemNama);
            tvWaktuTerbit = itemView.findViewById(R.id.tvItemWaktuTerbit);
            tvPublisher = itemView.findViewById(R.id.tvItemPublisher);
            tvRate = itemView.findViewById(R.id.tvItemRate);
            tvAuthor = itemView.findViewById(R.id.tvItemAuthor);
            tvGenre = itemView.findViewById(R.id.tvItemGenre);
            tvDesc = itemView.findViewById(R.id.tvDetailDesk);
            ivPhoto = itemView.findViewById(R.id.ivItemPhoto);
            LLItemBuku = itemView.findViewById(R.id.LLItemBuku);
        }
    }
}
