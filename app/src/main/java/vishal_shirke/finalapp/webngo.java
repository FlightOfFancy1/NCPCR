package vishal_shirke.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class webngo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i=getIntent();
        String url=i.getStringExtra("url");
        setContentView(R.layout.activity_webngo);
        WebView webView =(WebView)findViewById(R.id.webngo);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
