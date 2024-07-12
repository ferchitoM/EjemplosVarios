package com.example.ejemplosvarios;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView miVideo = findViewById(R.id.miVideo);

        int idVideo = R.raw.video_intro;
        String carpetaRecursos = "android.resource://" + getPackageName() + "/";
        Uri uri = Uri.parse(carpetaRecursos + idVideo);
        miVideo.setVideoURI(uri);
        miVideo.start();

        miVideo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                miVideo.setVisibility(VideoView.GONE);
            }
        });

    }
}