package vishal_shirke.finalapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.Legend;

import java.util.ArrayList;
import java.util.List;

import static vishal_shirke.finalapp.R.layout.activity_piechart;

public class piechart extends AppCompatActivity {


    PieChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_piechart);
        Intent i1 = getIntent();
        String id1 = i1.getStringExtra("id1");
        //TextView t1=(TextView)findViewById(R.id.piet1);
      //  if(id1.equals("1"))
       // {

           // t1.setText("Age at the time of reporting sexual assult/abuse in 2012");
            List<CustomObject> myList = new ArrayList<CustomObject>();
            CustomObject o1 = new CustomObject("13.8", "0-9");
            myList.add(o1);
            CustomObject o2 = new CustomObject("47.8", "10-19");
            myList.add(o2);
            CustomObject o3 = new CustomObject("10.6", "20-24");
            myList.add(o3);
            CustomObject o4 = new CustomObject("12.3", "25-34");
            myList.add(o4);
            CustomObject o5 = new CustomObject("12.4", "25-54");
            myList.add(o5);
            CustomObject o6 = new CustomObject("2.5", "55");
            myList.add(o6);
            mChart = (PieChart) findViewById(R.id.piChat);
            mChart.setHoleColor(Color.rgb(235, 235, 235));
            mChart.setValueTextColor(getResources().getColor(
                    R.color.card));
            mChart.setValueTextSize(16f);
            mChart.setHoleRadius(50f);
            mChart.setTransparentCircleRadius(40f);
            mChart.setDescription("Statistics source from ABS Recorded Crimes-Victims 2012 ");
            mChart.setDescriptionTextSize(22f);
            mChart.setDrawYValues(true);
            mChart.setDrawCenterText(true);
            mChart.setDrawUnitsInChart(true);
            mChart.setDrawHoleEnabled(true);
            mChart.setRotationAngle(30);
            // draws the corresponding description value into the slice
            mChart.setDrawXValues(true);
            mChart.setDrawYValues(true);
            // enable rotation of the chart by touch
            mChart.setRotationEnabled(true);
            // display percentage values
            mChart.setUsePercentValues(true);
            mChart.setTouchEnabled(true);

            mChart.setCenterText("");
            ArrayList<Entry> yVals1 = new ArrayList<Entry>();
            ArrayList<String> xVals = new ArrayList<String>();
            Paint p1 = mChart.getPaint(Chart.PAINT_HOLE);
            p1.setColor(getResources().getColor(R.color.card));
            mChart.setBackgroundColor(getResources()
                    .getColor(R.color.card));

            for (int i = 0; i < myList.size(); i++) {

                String percent = myList.get(i).getPercentage();

                String paramName = myList.get(i).getParameter();
                if (paramName.length() > 15) {
                    paramName = paramName.substring(0, 15) + "..";
                }
                Entry enti = new Entry(Float.parseFloat(percent), i);
                yVals1.add(enti);

                xVals.add(paramName);
            }

            PieDataSet set1 = new PieDataSet(yVals1, "Satatistics");
            set1.setSliceSpace(0f);
            // add a lot of colors
            ArrayList<Integer> colors = new ArrayList<Integer>();
            colors.add(getResources().getColor(R.color.colorPrimary));
            colors.add(getResources().getColor(R.color.color1));
            colors.add(getResources().getColor(R.color.yellow));
            colors.add(getResources().getColor(R.color.darkyellow));
            colors.add(getResources().getColor(R.color.color4));
        colors.add(getResources().getColor(R.color.fab));
            set1.setColors(colors);
            PieData data = new PieData(xVals, set1);
            mChart.setData(data);
            // undo all highlights
            mChart.highlightValues(null);
            mChart.invalidate();
            // holder.mChart.animateXY(1500, 1500);
            mChart.animateXY(3000, 3000);
            mChart.setDrawLegend(true);
            Legend l = mChart.getLegend();
            l.setFormSize(16f); // set the size of the legend forms/shapes
            l.setForm(Legend.LegendForm.CIRCLE); // set what type of form/shape should be used
            l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
            // l.setTypeface(...);
            l.setTextSize(12f);
            l.setTextColor(Color.BLACK);
            l.setXEntrySpace(5f); // set the space between the legend entries on the x-axis
            l.setYEntrySpace(5f); // set the space between the legend entries on the y-axis

        //}
    }
}
