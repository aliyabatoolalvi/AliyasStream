package com.example.aliyasstream;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import com.google.gson.Gson;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true); // Enable the back button
        }

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
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Handle the Up button click here (e.g., navigate back or perform some action)
                finish(); // Close the current activity
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

