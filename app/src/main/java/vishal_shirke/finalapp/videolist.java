package vishal_shirke.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class videolist extends AppCompatActivity{
    String strvid="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolist);
        CardView cv1=(CardView)findViewById(R.id.v1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              strvid="WIllOGnteFQ";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);

            }
        });
        CardView cv2=(CardView)findViewById(R.id.v2);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
strvid="CqjWE5h8F4c";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);

            }
        });
        CardView cv3=(CardView)findViewById(R.id.v3);
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strvid="WFeNLtrjGOk";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);
            }
        });
        CardView cv4=(CardView)findViewById(R.id.v4);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strvid="FlZWysUhEIU";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);

            }
        });
        CardView cv5=(CardView)findViewById(R.id.v5);
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strvid="a-hW6IDz-zE";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);

            }
        });
        CardView cv6=(CardView)findViewById(R.id.v6);
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strvid="5gguctU85m8";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);

            }
        });
        CardView cv7=(CardView)findViewById(R.id.v7);
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strvid="4vRkAA_cKdE";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);

            }
        });
        CardView cv8=(CardView)findViewById(R.id.v8);
        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strvid="_9HN8iey7HI";
                Intent intent = new Intent(videolist.this,videos.class);
                intent.putExtra("vid",strvid);
                startActivity(intent);

            }
        });
    }
}
