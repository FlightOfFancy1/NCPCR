package vishal_shirke.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class implink extends AppCompatActivity {
    Intent intentN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implink);
        intentN =new Intent(implink.this,webngo.class);
        TextView card_v1=(TextView)findViewById(R.id.title1);
        card_v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentN.putExtra("url","http://wcd.nic.in");
                startActivity(intentN);
            }
        });
        TextView card_v2=(TextView)findViewById(R.id.title2);
        card_v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentN.putExtra("url","http://mhrd.gov.in");
                startActivity(intentN);
            }
        });
        TextView card_v3=(TextView)findViewById(R.id.title3);
        card_v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentN.putExtra("url","http://khoyapaya.gov.in");
                startActivity(intentN);
            }
        });
        TextView card_v4=(TextView)findViewById(R.id.title4);
        card_v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentN.putExtra("url","http://trackthemissingchild.gov.in");
                startActivity(intentN);
            }
        });

    }
}
