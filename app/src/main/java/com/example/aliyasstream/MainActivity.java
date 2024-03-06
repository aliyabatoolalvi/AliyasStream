package com.example.aliyasstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        RecyclerView recyclerView;
        BlogAdapter adapter;
        List<Blog> data;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            data=getArticlesData();
            adapter=new BlogAdapter(this,data);
            recyclerView=findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);

        }

        private List<Blog> getArticlesData() {
            List<Blog> blogs=new ArrayList<>();
            Blog blog=new Blog(
                    "Textured Tapestry: A Close-up of Nature's Canvas",
                    R.drawable.image1,
                    "FEB 10, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.");
            blogs.add(blog);
            blog=new Blog(
                    "Dramatic Coastal Cliffs at Dusk",
                    R.drawable.image2,
                    "FEB 10, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
                    );
            blogs.add(blog);
            blog=new Blog(
                    "Textured Tapestry: A Close-up of Nature's Canvas",
                    R.drawable.image3,
                    "FEB 10, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
                    );
            blogs.add(blog);
            blog=new Blog(
                    "Textured Tapestry: A Close-up of Nature's Canvas",
                    R.drawable.image4,
                    "FEB 10, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
                    );
            blogs.add(blog);

            return blogs;
        }
    }
