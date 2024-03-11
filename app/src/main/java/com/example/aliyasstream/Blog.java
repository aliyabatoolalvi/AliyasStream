package com.example.aliyasstream;

public class Blog {
        String title;
        int image;
        String date;
        String description;

        public Blog(String title, int image, String date, String description) {
            this.title = title;
            this.image = image;
            this.date = date;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }
    }


