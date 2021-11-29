package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int image = 1;

    public void previous(View view){
        ImageView img = findViewById(R.id.imageView1);
        if(image == 1){
            image = 5;
            img.setImageResource(R.drawable.img5);
        }
        else if(image == 2){
            image = 1; 
            img.setImageResource(R.drawable.img1);
        }
        else if(image == 3){
            image = 2;
            img.setImageResource(R.drawable.img2);
        }
        else if(image == 4){
            image = 3;
            img.setImageResource(R.drawable.img3);
        }
        else if(image == 5){
            image = 4;
            img.setImageResource(R.drawable.img4);
        }
    }

    public void next(View view){
        ImageView img = findViewById(R.id.imageView1);
        if(image == 1){
            image = 2;
            img.setImageResource(R.drawable.img2);
        }
        else if(image == 2){
            image = 3;
            img.setImageResource(R.drawable.img3);
        }
        else if(image == 3){
            image = 4;
            img.setImageResource(R.drawable.img4);
        }
        else if(image == 4){
            image = 5;
            img.setImageResource(R.drawable.img5);
        }
        else if(image == 5){
            image = 1;
            img.setImageResource(R.drawable.img1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}