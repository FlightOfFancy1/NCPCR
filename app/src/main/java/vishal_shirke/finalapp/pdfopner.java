package vishal_shirke.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import static vishal_shirke.finalapp.R.id.pdfView;

public class pdfopner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopner);
       String filename=" ";
        Intent i = getIntent();
        String id1 = i.getStringExtra("id1");
        PDFView pdfView =(PDFView)findViewById(R.id.pdfView);
        if(id1.equals("1"))
            filename="sexual_offences.pdf";
        else if(id1.equals("4"))
            filename="bonded_labour.pdf";
        else if(id1.equals("5"))
            filename="child_labour.pdf";
        else if(id1.equals("6"))
            filename="child_labour.pdf";
        else if(id1.equals("7"))
            filename="pledgingoflabour.pdf";
        else if(id1.equals("8"))
            filename="factories.pdf";
        else if(id1.equals("9"))
            filename="child_labour.pdf";
        else if(id1.equals("10"))
            filename="child_labour.pdf";
        else if(id1.equals("11"))
            filename="child_labour.pdf";
        else if(id1.equals("12"))
            filename="child_labour.pdf";
        else if(id1.equals("13"))
            filename="child_labour.pdf";
        else if(id1.equals("14"))
            filename="child_labour.pdf";
        else if(id1.equals("15"))
            filename="child_labour.pdf";
        else if(id1.equals("16"))
            filename="child_labour.pdf";
        else if(id1.equals("17"))
            filename="child_labour.pdf";
        else if(id1.equals("18"))
            filename="child_labour.pdf";
        else if(id1.equals("19"))
            filename="child_labour.pdf";
        else if(id1.equals("20"))
            filename="child_labour.pdf";
        pdfView.fromAsset("pdf/"+filename)
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                .load();
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Intent intent =new Intent(this,ActsDetails.class);
//        startActivity(intent);
//    }
}
