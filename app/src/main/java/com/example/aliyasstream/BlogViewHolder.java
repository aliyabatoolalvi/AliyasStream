package com.example.aliyasstream;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BlogViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView title;
    TextView date;
    LinearLayout post;
    public BlogViewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.image);
        title=itemView.findViewById(R.id.title);
        date=itemView.findViewById(R.id.date);
        post=itemView.findViewById(R.id.post);
    }

}
