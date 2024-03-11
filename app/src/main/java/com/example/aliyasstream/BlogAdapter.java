package com.example.aliyasstream;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

public class BlogAdapter extends RecyclerView.Adapter<BlogViewHolder>{

    Context context;
    List<Blog> data;

    public BlogAdapter(Context context, List<Blog> data) {
        this.context = context;
        this.data = data;
    }



    @NonNull
    public BlogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_article,parent,false);
        return new BlogViewHolder(view);
    }


    public void onBindViewHolder(@NonNull BlogViewHolder holder, int position) {
        Blog blog=data.get(position);
        holder.date.setText(blog.getDate());
        holder.title.setText(blog.getTitle());
        holder.image.setImageResource(blog.getImage());
        holder.post.setOnClickListener(v -> {
            Intent intent=new Intent(context,BlogDetailsActivity.class);
            intent.putExtra("data",new Gson().toJson(blog));
            context.startActivity(intent);
        });
    }



    public int getItemCount() {
        return data.size();
    }
}


