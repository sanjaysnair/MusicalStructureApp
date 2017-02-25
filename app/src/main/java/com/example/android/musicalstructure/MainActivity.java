package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView album1 = (TextView)findViewById(R.id.album_1);

        album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumDetailIntent = new Intent(MainActivity.this, AlbumDetailActivity.class);
                albumDetailIntent.putExtra("ALBUM_NAME", getString(R.string.album_name_1));
                startActivity(albumDetailIntent);
            }
        });
    }
}
