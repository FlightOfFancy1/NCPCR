package vishal_shirke.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeInitializationResult;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class videos extends YouTubeBaseActivity
 {
     String videoId=" ";
    YouTubePlayerView youTubePlayerView;
     Button btnplay;
     YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent i = getIntent();
        videoId = i.getStringExtra("vid");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        btnplay=(Button)findViewById(R.id.play);
        youTubePlayerView  =(YouTubePlayerView)findViewById(R.id.vedio);

        onInitializedListener =new YouTubePlayer.OnInitializedListener(){

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
youTubePlayer.loadVideo(videoId);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        btnplay.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(vedioplayer.API_KEY,onInitializedListener);
            }
        });
    }


 }
