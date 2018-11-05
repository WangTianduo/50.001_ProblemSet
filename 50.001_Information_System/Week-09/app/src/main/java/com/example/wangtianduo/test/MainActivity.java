package com.example.wangtianduo.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;

    ArrayList<Integer> images;
    Button charaButton;
    ImageView charaImage;
    TextView charaTextView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1.3 Instantiate an ArrayList object

        images = new ArrayList<>();

        //TODO 1.4 Add the image IDs to the ArrayList

        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.dory);
        images.add(R.drawable.nickwilde);

        //TODO 1.5 Get references to charaButton and charaImage using findViewById

        charaButton = findViewById(R.id.charaButton);
        charaImage = findViewById(R.id.charaImage);
        charaTextView = findViewById(R.id.textView);

        //TODO 1.6 For charaButton, invoke the setOnClickListenerMethod
        //TODO 1.7 Create an anonymous class which implements View.OnClickListener
        //TODO 1.8 Write code to randomly select an image ID from the ArrayList and display it in the ImageView
        charaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code goes here
                int index = (count) % images.size();
                count = count + 1;

                int id = images.get(index);
                charaImage.setImageResource(id);
            }
        });
        //TODO 1.9 [On your own] Create another Button to always display the first image


    }
}
