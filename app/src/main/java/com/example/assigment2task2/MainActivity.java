package com.example.assigment2task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int i;
    ImageButton ib;
    ImageView iv;
    Random rnd=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=0;
        iv=(ImageView) findViewById(R.id.imageView);
        rnd=new Random();
        ib=(ImageButton) findViewById(R.id.im);
    }

    public void change(View view) {

        i=rnd.nextInt(3);
        i=i+1;


        switch (i) {
            case 1:
                ib.setImageResource(R.drawable.one);
                break;
            case 2:
                ib.setImageResource(R.drawable.two);
                break;
            case 3:
                ib.setImageResource(R.drawable.three);
                break;
        }
    }
}
