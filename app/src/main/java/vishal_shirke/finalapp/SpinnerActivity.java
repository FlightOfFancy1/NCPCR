package vishal_shirke.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {
   Spinner spinner;
    TextView textview;
    ListView listView;
    ImageView imageView;
    TextView textview1;
    TextView textView3;
    ArrayAdapter<CharSequence> adapter;
    Intent intentN;

    int Images[]={R.drawable.aarti,R.drawable.abhoy_mission,R.drawable.action_development,R.drawable.adarsh,R.drawable.akansha,R.drawable.akhanda_seva,
     R.drawable.ashray,R.drawable.bani_mandir,R.drawable.catalyst_social_action,R.drawable.charutar};

   String Names[]={"AARTI FOR GIRLS ANDHRA PRADESH  KADAPA","ABHOY MISSION TRIPURA AGARTALA",
           "ACTION FOR DEVELOPMENT OF DEMOS BIHAR PATNA","ADARSH CHARITABLE TRUST KERALA ERNAKULAM",
           "AKANSHA PUBLIC CHARITABLE TRUST TAMIL NADU CHENNAI","AKHANDA SEVA FOR INTERNATIONAL SHANTI KARNATAKA MYSORE",
           "ASHRAY AKRUTI TELANGANA HYDERABAD","BANI MANDIR WEST BENGAL SOUTH 24 PARAGANAS",
           "CATALYST FOR SOCIAL ACTION MAHARASHTRA PUNE","CHARUTAR AROGYA MANDAL GUJARAT KARAMSAD"};

    String Url[]={"https://www.aartiforgirls.org/","http://www.abhoymission.org/","https://projectheena.com/demos","http://adarshrehab.org/contact","http://www.imleemahuaa.org/akanksha.html",
            "http://www.operation-shanti.org/","http://ashrayakruti.org/","http://www.banimandir.in/","http://www.csa.org.in/","http://www.charutarhealth.org/" };

    String contact[]={"9440280111","9436123069","91-6122367665","9447391730","9926683778","8212598160","040-40042250","9433520046","91-2066083777","91-2692228411" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
       //spinner= (Spinner) findViewById(R.id.sp);
        listView= (ListView) findViewById(R.id.lv);
        final CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        //adapter=ArrayAdapter.createFromResource(this,R.array.state_names,android.R.layout.simple_spinner_item);
       // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       /* spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                int sid = spinner.getSelectedItemPosition();
                if(sid==1)
                   {
                     listView.setAdapter(customAdapter);
                   }
            }
                //Toast.makeText(getBaseContext(),parent.getItemAtPosition(i)+" Selected",Toast.LENGTH_LONG).show();
           @Override
             public void onNothingSelected(AdapterView<?> parent) {return;
            }
        });*/


        //spinner.getOnItemSelectedListener();
        intentN =new Intent(SpinnerActivity.this,webngo.class);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:

                          intentN.putExtra("url",Url[0]);
                          startActivity(intentN);
                          break;
                    case 1:

                        intentN.putExtra("url",Url[1]);
                        startActivity(intentN);
                        break;
                    case 2:

                        intentN.putExtra("url",Url[2]);
                        startActivity(intentN);
                        break;
                    case 3:

                        intentN.putExtra("url",Url[3]);
                        startActivity(intentN);
                        break;
                    case 4:

                        intentN.putExtra("url",Url[4]);
                        startActivity(intentN);
                        break;
                    case 5:

                        intentN.putExtra("url",Url[5]);
                        startActivity(intentN);
                        break;
                    case 6:

                        intentN.putExtra("url",Url[6]);
                        startActivity(intentN);
                        break;
                    case 7:

                        intentN.putExtra("url",Url[7]);
                        startActivity(intentN);
                        break;
                    case 8:

                        intentN.putExtra("url",Url[8]);
                        startActivity(intentN);
                        break;

                    case 9:

                        intentN.putExtra("url",Url[9]);
                        startActivity(intentN);
                        break;

                }

            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Images.length;
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

            convertView=getLayoutInflater().inflate(R.layout.custom_listview,null);
            textview= (TextView)convertView.findViewById(R.id.textView);
            imageView= (ImageView)convertView.findViewById(R.id.imageView);
            textview1= (TextView)convertView.findViewById(R.id.textView2);
            textView3= (TextView)convertView.findViewById(R.id.textView3);
            textview.setText(Names[i]);
            imageView.setImageResource(Images[i]);
            textview1.setText(Url[i]);
            textView3.setText(contact[i]);
            return convertView;
        }
    }

}


