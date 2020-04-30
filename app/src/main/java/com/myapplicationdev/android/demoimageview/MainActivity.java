package com.myapplicationdev.android.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivDay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the imageView obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        //Set the image
        ivDay2.setImageResource(R.drawable.day2);

    }
}
