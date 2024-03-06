package com.example.aliyasstream;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.Gson;

import androidx.appcompat.app.AppCompatActivity;

public class BlogDetailsActivity extends AppCompatActivity {

    TextView title;
    TextView date;
    TextView details;
    ImageView image;
    Blog blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_details);

        title=findViewById(R.id.title);
        date=findViewById(R.id.date);
        details=findViewById(R.id.details);
        image=findViewById(R.id.image);

        blog=new Gson().fromJson(getIntent().getStringExtra("data"),Blog.class);

        title.setText(blog.getTitle());
        date.setText(blog.getDate());
        details.setText(blog.getDescription());
        image.setImageResource(blog.getImage());

    }
}

