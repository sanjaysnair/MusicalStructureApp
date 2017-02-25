package com.example.android.musicalstructure;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.android.musicalstructure.R.style.albumName;

public class AlbumDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        Intent intent = getIntent();

        String albumName = intent.getStringExtra("ALBUM_NAME");
        String albumNameStr = getString(R.string.album_name_1);

        TextView albumDetailHeading = (TextView) findViewById(R.id.album_detail_heading);
        albumDetailHeading.setText("Album Name: " + albumName);

        LinearLayout ll = (LinearLayout) findViewById(R.id.album_detail_song_list);

        if (albumName.contentEquals(albumNameStr)) {

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(0, 10, 0, 10);

            TextView song1TextView = new TextView(this);
            song1TextView.setText(getString(R.string.album1_song1));
            TextViewCompat.setTextAppearance(song1TextView, R.style.albumName);
            song1TextView.setPadding(32, 16, 16, 16);
            song1TextView.setBackgroundResource(R.color.albumNameBg);
            song1TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(AlbumDetailActivity.this, NowPlayingActivity.class);
                    i.putExtra("SONG_NAME", getString(R.string.album1_song1));
                    startActivity(i);
                }
            });

            TextView song2TextView = new TextView(this);
            song2TextView.setText(getString(R.string.album1_song2));
            TextViewCompat.setTextAppearance(song2TextView, R.style.albumName);
            song2TextView.setPadding(32, 16, 16, 16);
            song2TextView.setBackgroundResource(R.color.albumNameBg);
            song2TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(AlbumDetailActivity.this, NowPlayingActivity.class);
                    i.putExtra("SONG_NAME", getString(R.string.album1_song2));
                    startActivity(i);
                }
            });

            TextView song3TextView = new TextView(this);
            song3TextView.setText(getString(R.string.album1_song3));
            TextViewCompat.setTextAppearance(song3TextView, R.style.albumName);
            song3TextView.setPadding(32, 16, 16, 16);
            song3TextView.setBackgroundResource(R.color.albumNameBg);
            song3TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(AlbumDetailActivity.this, NowPlayingActivity.class);
                    i.putExtra("SONG_NAME", getString(R.string.album1_song3));
                    startActivity(i);
                }
            });

            TextView song4TextView = new TextView(this);
            song4TextView.setText(getString(R.string.album1_song4));
            TextViewCompat.setTextAppearance(song4TextView, R.style.albumName);
            song4TextView.setPadding(32, 16, 16, 16);
            song4TextView.setBackgroundResource(R.color.albumNameBg);
            song4TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(AlbumDetailActivity.this, NowPlayingActivity.class);
                    i.putExtra("SONG_NAME", getString(R.string.album1_song4));
                    startActivity(i);
                }
            });

            TextView song5TextView = new TextView(this);
            song5TextView.setText(getString(R.string.album1_song5));
            TextViewCompat.setTextAppearance(song5TextView, R.style.albumName);
            song5TextView.setPadding(32, 16, 16, 16);
            song5TextView.setBackgroundResource(R.color.albumNameBg);
            song5TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(AlbumDetailActivity.this, NowPlayingActivity.class);
                    i.putExtra("SONG_NAME", getString(R.string.album1_song5));
                    startActivity(i);
                }
            });

            TextView song6TextView = new TextView(this);
            song6TextView.setText(getString(R.string.album1_song6));
            TextViewCompat.setTextAppearance(song6TextView, R.style.albumName);
            song6TextView.setPadding(32, 16, 16, 16);
            song6TextView.setBackgroundResource(R.color.albumNameBg);
            song6TextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(AlbumDetailActivity.this, NowPlayingActivity.class);
                    i.putExtra("SONG_NAME", getString(R.string.album1_song6));
                    startActivity(i);
                }
            });

            ll.addView(song1TextView, params);
            ll.addView(song2TextView, params);
            ll.addView(song3TextView, params);
            ll.addView(song4TextView, params);
            ll.addView(song5TextView, params);
            ll.addView(song6TextView, params);

        }
    }
}
