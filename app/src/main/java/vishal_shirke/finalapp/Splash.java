package vishal_shirke.finalapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class Splash extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        getSupportActionBar().hide();

        // Videoview at the launching of Application
        videoView=(VideoView)findViewById(R.id.video);
        Uri video=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.splash);
        videoView.setVideoURI(video);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // After finishing video launching home screen
                startActivity(new Intent(Splash.this,MainActivity.class));
                finish();
            }
        });

        videoView.start();
    }
    }
