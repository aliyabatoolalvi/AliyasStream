package com.example.aliyasstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        RecyclerView recyclerView;
        ArticlesAdapter adapter;
        List<Article> data;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            data=getArticlesData();
            adapter=new ArticlesAdapter(this,data);
            recyclerView=findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);

        }

        private List<Blog> getArticlesData() {
            List<Blog> blogs=new ArrayList<>();
            Blog blog=new Blog(
                    "Everything You Need to Know About Camouflage, According to a U.S. Army Sniper Course Instructor",
                    "MATT CRISARA",
                    "FEB 10, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                    R.drawable.image1
            );
            articles.add(blog);
            blog=new Blog(
                    "The LAV-25: Everything You Need to Know About the Marines’ Favorite Ride",
                    " KYLE MIZOKAMI",
                    "FEB 21, 2024",
                    "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                    R.drawable.image2
            );
            articles.add(blog);
            blog=new Blog(
                    "The LAV-25: Everything You Need to Know About the Marines’ Favorite Ride",
                    " KYLE MIZOKAMI",
                    "FEB 21, 2024",
                    "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                    R.drawable.image2
            );
            articles.add(blog);
            blog=new Blog(
                    "The LAV-25: Everything You Need to Know About the Marines’ Favorite Ride",
                    " KYLE MIZOKAMI",
                    "FEB 21, 2024",
                    "HuIts speed and firepower, coupled with its exceptional ability to deploy worldwide at a moment’s notice, makes the LAV-25 an ideal component of any crisis response force.mans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.",
                    R.drawable.image2
            );
            articles.add(blog);

            return blogs;
        }

    }
}