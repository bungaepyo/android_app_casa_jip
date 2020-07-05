package com.example.casa_jip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ImageActivity extends AppCompatActivity {

    private ImageView ImageViewThumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageViewThumbnail = findViewById(R.id.image_detail_thumbnail);

        //Receiving Data From Adapter
        Intent intent = getIntent();
        String ImageUrl = intent.getExtras().getString("Url");

        //Setting the values in the layout
        Glide.with(ImageActivity.this.getBaseContext()).load(ImageUrl).into(ImageViewThumbnail);
    }
}