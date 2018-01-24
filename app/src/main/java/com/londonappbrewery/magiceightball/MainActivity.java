package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView image;
        Button askButton;
        final int[] answers = {R.drawable.index1,R.drawable.index2,R.drawable.index3};
        askButton = (Button)findViewById(R.id.askButton);
        image = (ImageView)findViewById(R.id.image_answer);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int next = random.nextInt(3);
                image.setImageResource(answers[next]);
            }
        });

    }
}
