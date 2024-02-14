package com.example.songsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button,button5,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        int click = v.getId();

        if(click == R.id.button){
            playsounds(R.raw.oneofthegirls);
        } else if (click == R.id.button2) {
            playsounds(R.raw.bloodlinexpony);
        }else if (click == R.id.button3) {
            playsounds(R.raw.rodeospedup);
        }else if (click == R.id.button4) {
            playsounds(R.raw.company);
        }else if (click == R.id.button5) {
            playsounds(R.raw.redrum);
        }

    }

    public  void playsounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,id);
        mediaPlayer.start();
    }
}