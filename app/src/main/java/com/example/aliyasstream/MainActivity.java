package com.example.aliyasstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
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
                    "Close-up of Nature's Canvas",
                    R.drawable.image1,
                    "FEB 10, 2024",
                    "In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage.");
            blogs.add(blog);
            blog=new Blog(
                    "Dramatic Coastal Cliffs at Dusk",
                    R.drawable.image2,
                    "FEB 11, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
                    );
            blogs.add(blog);
            blog=new Blog(
                    "A Close-up of Nature's Canvas",
                    R.drawable.image3,
                    "FEB 15, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
                    );
            blogs.add(blog);
            blog=new Blog(
                    "A Close-up of Nature's Canvas",
                    R.drawable.image4,
                    "FEB 12, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
                    );
            blogs.add(blog);
            blog=new Blog(

                    "Vivid Blossom Elegance",
                    //5th
                    R.drawable.image5,
                    "FEB 14, 2024",
                    "Immerse yourself in the vibrant allure of this flower portrait, where a delicate bloom takes center stage. The rich, contrasting hues of the petals create a visual symphony, capturing the essence of nature's vivacity in a single frame."
            );
            blogs.add(blog); blog=new Blog(
                    "Graceful Petal Ballet",
                    R.drawable.image6,
                    "FEB 16, 2024",
                    "Witness the poetic dance of petals as this flower portrait gracefully captures the intricate movements of nature. The delicately unfurling petals resemble a ballet in progress, showcasing the inherent beauty and elegance of the floral world."
            );
            blogs.add(blog); blog=new Blog(
                    "Macro Majesty",
                    R.drawable.image7,
                    "FEB 29, 2024",
                    "This close-up flower portrait unveils the unseen intricacies of nature's masterpiece. With meticulous attention to detail, the image showcases the velvety texture of each petal, revealing a world of minute details that often go unnoticed."
            );
            blogs.add(blog); blog=new Blog(
                    "Gray Clouds Grace",
                    R.drawable.image8,
                    "Mar 1, 12, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
            );
            blogs.add(blog); blog=new Blog(
                    "Sun sitting on tractor",
                    R.drawable.image9,
                    "MAR 2,, 2024",
                    "Humans aren’t great at blending in with their environment. In the 20th century—after we ditched the rather barbaric style of fighting wars in fields, with line formations charging at one another—camouflage would become a vital tool. This has grown into a multi-billion-dollar industry meant to keep soldiers hidden on the battlefield, offering a significant tactical advantage."
            );
            blogs.add(blog); blog=new Blog(
                    "Burning in fire",
                    R.drawable.image10,
                    "MAR 3, 2024",
                    "Capture the essence of village life with this intimate portrait of a stove in a quaint countryside setting. The rustic charm of the stove becomes a focal point, reflecting the heart and soul of a community where warmth and sustenance are shared around this central fixture."
            );
            blogs.add(blog); blog=new Blog(
                    "Nature's network",
                    R.drawable.image11,
                    "MAR 4, 2024",
                    "Witness the ever-changing beauty of trees as they transform with the seasons. From the delicate blossoms of spring to the fiery hues of autumn, this portrait captures the dynamic tapestry of nature, showcasing the trees as living canvases that reflect the passage of time."
            );
            blogs.add(blog);
            blog=new Blog(
                    "Sweaty leaves",
                    R.drawable.image12,
                    "MAR 6, 2024",
                    "Explore the intricate patterns of tree roots in this intimate portrait. Beneath the surface, a network of roots connects trees in a harmonious dance with the earth. This portrayal invites contemplation on the interconnectedness of all living things and the silent strength that lies beneath the surface."
            );
            blogs.add(blog);
            blog=new Blog(
                    "Sweaty leaves",
                    R.drawable.image13,
                    "MAR 6, 2024",
                    "Explore the intricate patterns of tree roots in this intimate portrait. Beneath the surface, a network of roots connects trees in a harmonious dance with the earth. This portrayal invites contemplation on the interconnectedness of all living things and the silent strength that lies beneath the surface."
            );
            blogs.add(blog);

            blog=new Blog(
                    "Sky watching itself in mirror",
                    R.drawable.image14,
                    "MAR 6, 2024",
                    "Explore the intricate patterns of tree roots in this intimate portrait. Beneath the surface, a network of roots connects trees in a harmonious dance with the earth. This portrayal invites contemplation on the interconnectedness of all living things and the silent strength that lies beneath the surface."
            );
            blogs.add(blog);
            blog=new Blog(
                    "yellow in grace",
                    R.drawable.image15,
                    "MAR 6, 2024",
                    "Explore the intricate patterns of tree roots in this intimate portrait. Beneath the surface, a network of roots connects trees in a harmonious dance with the earth. This portrayal invites contemplation on the interconnectedness of all living things and the silent strength that lies beneath the surface."
            );
            blogs.add(blog);
            return blogs;
        }
    }
