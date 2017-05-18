package vishal_shirke.finalapp;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.Legend;

import java.util.ArrayList;
import java.util.List;

public class ActsDetails extends AppCompatActivity implements View.OnClickListener {
//String id;
PieChart mChart;
String msgtitle=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acts_details);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  setSupportActionBar(toolbar);
        TextView t1 = (TextView) findViewById(R.id.t1);
        final ImageView i1 = (ImageView) findViewById(R.id.img);
        TextView t2 = (TextView) findViewById(R.id.txtactno);
        TextView t3 = (TextView) findViewById(R.id.txtsummary);
        TextView t4 = (TextView) findViewById(R.id.txtpenalties);
        TextView phead = (TextView) findViewById(R.id.phead);
        //TextView shead1 = (TextView) findViewById(R.id.shead);
        TextView shead = (TextView) findViewById(R.id.shead);


        Intent i = getIntent();
        final String id = i.getStringExtra("id");
        // this.id=id;

        if (id.equals("1"))
            msgtitle = "POSCO Act";
        if (id.equals("4"))
            msgtitle = "Bonded Labour System Act";
        if (id.equals("5"))
            msgtitle = "POSCO Act";
        if (id.equals("6"))
            msgtitle = "POSCO Act";
        if (id.equals("7"))
            msgtitle = "POSCO Act";
        if (id.equals("8"))
            msgtitle = "POSCO Act";
        if (id.equals("9"))
            msgtitle = "POSCO Act";
        if (id.equals("10"))
            msgtitle = "POSCO Act";
        if (id.equals("11"))
            msgtitle = "POSCO Act";
        if (id.equals("12"))
            msgtitle = "POSCO Act";
        if (id.equals("13"))
            msgtitle = "POSCO Act";
        if (id.equals("14"))
            msgtitle = "POSCO Act";
        if (id.equals("15"))
            msgtitle = "POSCO Act";
        if (id.equals("16"))
            msgtitle = "POSCO Act";
        if (id.equals("17"))
            msgtitle = "POSCO Act";
        if (id.equals("18"))
            msgtitle = "POSCO Act";
        if (id.equals("19"))
            msgtitle = "POSCO Act";
        if (id.equals("20"))
            msgtitle = "POSCO Act";

        String strname = i.getStringExtra("name");
        String actno = i.getStringExtra("actno");
        String year = i.getStringExtra("year");
        final String summary = i.getStringExtra("summary");
        final String stats = i.getStringExtra("stats");
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/raleway.semibold.ttf");
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/roboto_regular(1).ttf");
       // Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/droidserif_italic.ttf");
        t1.setText("" + strname);

        t1.setTypeface(tf);
        t1.setTextColor(Color.BLACK);
        t2.setText(getString(R.string.actno)+"" + String.valueOf(actno) +getString(R.string.year)+ "" + String.valueOf(year));
        t2.setTextColor(Color.BLACK);
        t2.setTypeface(tf1);
        shead.setText(getString(R.string.actno)+"");
        shead.setTypeface(tf1);
        shead.setTextColor(Color.BLACK);
        t3.setText(getString(R.string.summary)+"" + summary+"\n");

        t3.setTypeface(tf1);
        t3.setTextColor(Color.BLACK);
        phead.setText(getString(R.string.penalties)+"");
        phead.setTypeface(tf1);
        phead.setTextColor(Color.BLACK);
        t4.setText("" + stats);
        t4.setTextColor(Color.BLACK);
        t4.setTypeface(tf1);
        if (id.equals("1"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.commissionsecondary));
        if (id.equals("4"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.educationsecondary));
        if (id.equals("5"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.factorysecondary));
        if (id.equals("6"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.guardiansecondary));
        if (id.equals("7"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.infaintsecondary));
        if (id.equals("8"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.marragesecondary));
        if (id.equals("9"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.minesecondary));
        if (id.equals("10"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.pledgingsecondary));
        if (id.equals("11"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.traffickingsecondary));
        if (id.equals("12"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("13"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("14"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("15"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("16"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("17"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("18"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("19"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        if (id.equals("20"))
            i1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.e_eight));
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PackageManager pm = getPackageManager();
                try {

                    Intent waIntent = new Intent(Intent.ACTION_SEND);
                    waIntent.setType("text/plain");
                    String text = "*" + msgtitle + "*\n"+summary+"\n*Penalties:*\n"+stats+"\n\n_I_ _just_ _read_ _this_ _interesting_ _act_\n_on_ *NCPCR's* _official_ _app_\n_have_ _a_ _look_ _!!_\n~www.google.com~";

                    PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                    //Check if package exists or not. If not then code
                    //in catch block will be called
                    waIntent.setPackage("com.whatsapp");

                    waIntent.putExtra(Intent.EXTRA_TEXT, text);
                    startActivity(Intent.createChooser(waIntent, "Share this Act via"));

                } catch (PackageManager.NameNotFoundException e) {
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "" + msgtitle + "\n"+summary+"\nPenalties:\n"+stats+"\n\nI just read this act\non NCPCR's official app\nhave a look\nwww.google.com");
                    sendIntent.setType("text/plain");
                    startActivity(Intent.createChooser(sendIntent, "Share this Act via"));
                    startActivity(sendIntent);
                }


            }
        });
        Button OpenPDF = (Button) findViewById(R.id.pdf);
        OpenPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActsDetails.this, pdfopner.class);
                intent.putExtra("id1", id);
                startActivity(intent);
            }
        });

        Button pie =(Button)findViewById(R.id.btnpie);
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActsDetails.this, piechart.class);
                intent.putExtra("id1", id);
                startActivity(intent);
            }
        });

    }


    @Override
    public void onClick(View v) {


    }
}
