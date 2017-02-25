package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.musicalstructure.R.style.albumName;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Intent intent = getIntent();

        String songName = intent.getStringExtra("SONG_NAME");

        TextView nowPlayingHeading = (TextView) findViewById(R.id.now_playing_heading);
        nowPlayingHeading.setText("Song Name: " + songName);
    }
}
