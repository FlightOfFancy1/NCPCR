package vishal_shirke.finalapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static vishal_shirke.finalapp.MainActivity.a;


public class grid_view extends AppCompatActivity implements View.OnClickListener {

    GridView gridview;
    GridAdapter adapter;
    ArrayList<items> arritems;
    int i1, i2, i3, i4;
    String strSummary, strFiestName, strStats,where;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridview = (GridView) findViewById(R.id.gridview);
        arritems = new ArrayList<items>();
        arritems.add(new items(R.drawable.pocso,getString(R.string.act1)+""));
        arritems.add(new items(R.drawable.traffickingprimary,getString(R.string.act2)+""));
        arritems.add(new items(R.drawable.childbondo,getString(R.string.act3)+""));
        arritems.add(new items(R.drawable.marragemain,getString(R.string.act4)+""));
        arritems.add(new items(R.drawable.commissionprimary,getString(R.string.act5)+""));
        arritems.add(new items(R.drawable.factoryprimary,getString(R.string.act6)+""));
        arritems.add(new items(R.drawable.educationprimary,getString(R.string.act7)+""));
        arritems.add(new items(R.drawable.guardianprimary,getString(R.string.act8)+""));
        arritems.add(new items(R.drawable.mineprimary,getString(R.string.act9)+""));
        arritems.add(new items(R.drawable.guardiansact,getString(R.string.act10)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act11)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act12)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act13)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act14)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act15)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act16)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act17)+""));
        arritems.add(new items(R.drawable.actshome,getString(R.string.act18)+""));
        adapter = new GridAdapter(grid_view.this, arritems);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                /*Toast.makeText(grid_view.this, "" + position,
                        Toast.LENGTH_SHORT).show();*/
                switch(position){
                    case 0:
                        where="id=1";
                        break;
                    case 1:
                        where="id=4";
                        break;
                    case 2:
                        where="id=5";
                        break;
                    case 3:
                        where="id=6";
                        break;
                    case 4:
                        where="id=7";
                        break;
                    case 5:
                        where="id=8";
                        break;
                    case 6:
                        where="id=9";
                        break;
                    case 7:
                        where="id=10";
                        break;
                    case 8:
                        where="id=11";
                        break;
                    case 9:
                        where="id=12";
                        break;
                    case 10:
                        where="id=13";
                        break;
                    case 11:
                        where="id=14";
                        break;
                    case 12:
                        where="id=15";
                        break;
                    case 13:
                        where="id=16";
                        break;
                    case 14:
                        where="id=17";
                        break;
                    case 15:
                        where="id=18";
                        break;
                    case 16:
                        where="id=19";
                        break;
                    case 17:
                        where="id=20";
                        break;
                }
                DatabaseAccess db2 = DatabaseAccess.getInstance(grid_view.this);
                db2.open();

                Cursor cur;
                if(a) {
                    cur = db2.getValues("actshindi", null, where);
                }
                else {
                    cur = db2.getValues("acts", null, where);

                }
                try {

                    if (!(cur == null)) {
                        if (cur.getCount() > 0) {

                            if (cur.moveToFirst()) {
                                do {

                                    i1 = cur.getInt(cur
                                            .getColumnIndex("id"));

                                    strFiestName = cur.getString(cur
                                            .getColumnIndex("name"));
                                    i2 = cur.getInt(cur
                                            .getColumnIndex("actno"));
                                    i3 = cur.getInt(cur
                                            .getColumnIndex("year"));
                                    strSummary = cur.getString(cur
                                            .getColumnIndex("summary"));
                                  //  i4 = cur.getInt(cur
                                         //   .getColumnIndex("righno"));
                                    strStats = cur.getString(cur
                                            .getColumnIndex("penalties"));

                                } while (cur.moveToNext());
                            }

                        }
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
               /* Toast.makeText(grid_view.this, "Name" + strFiestName, Toast.LENGTH_SHORT).show();
                Toast.makeText(grid_view.this, "Act no" + i2, Toast.LENGTH_SHORT).show();
                Toast.makeText(grid_view.this, "Year" + i3, Toast.LENGTH_SHORT).show();
                Toast.makeText(grid_view.this, "Summary" +strSummary, Toast.LENGTH_SHORT).show();

                Toast.makeText(grid_view.this, "Statistics" +strStats, Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(grid_view.this,ActsDetails.class);
                intent.putExtra("id",String.valueOf(i1));
                intent.putExtra("name",strFiestName);
                intent.putExtra("actno",String.valueOf(i2));
                intent.putExtra("year",String.valueOf(i3));
                intent.putExtra("summary",strSummary);
                intent.putExtra("stats",strStats);
             //   intent.putExtra("rightno",String.valueOf(i4));
                startActivity(intent);

            }


        });
    }

    @Override
    public void onClick(View view) {

    }


    public class GridAdapter extends BaseAdapter {
        Activity activity_grid_view;
        ArrayList<items> arritems;

        public GridAdapter(Activity activity_grid_view, ArrayList<items> arritems) {
            this.activity_grid_view = activity_grid_view;
            this.arritems = arritems;
        }


        @Override
        public int getCount() {
            return arritems.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view = convertView;
            final ViewHolder holder;

            if (convertView == null) {
                view = (activity_grid_view).getLayoutInflater().inflate(R.layout.items_layout, parent, false);
                holder = new ViewHolder();

                holder.image_display = (ImageView) view.findViewById(R.id.image_display);
                holder.textView=(TextView)view.findViewById(R.id.textView2);


                view.setTag(holder);
            } else {

                holder = (ViewHolder) view.getTag();
            }


            holder.image_display.setImageResource(arritems.get(i).getDarawable());
            holder.textView.setText(arritems.get(i).getAct());
//holder.image_display.setOnClickListener(this);
            return view;
        }


        private class ViewHolder {
            ImageView image_display;
            TextView textView;
        }


    }
}
