package vishal_shirke.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class feedback extends AppCompatActivity {
    Spinner spinner;
    Intent callIntent;
    boolean status=false;
    int sid=0;
    ArrayAdapter<CharSequence> adapter2;
    String mailid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        //EditText to = (EditText) findViewById(R.id.sendTo);
        final EditText subject = (EditText) findViewById(R.id.subject);
        final EditText feedback = (EditText) findViewById(R.id.feedback);
        final Button submit = (Button) findViewById(R.id.submit);


        spinner=(Spinner) findViewById(R.id.sp);
        adapter2= ArrayAdapter.createFromResource(this,R.array.actnames,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                status=true;
                //Toast.makeText(parent.getContext(),"OnItemSelectedListener :"+parent.getItemAtPosition(position),
                //Toast.LENGTH_SHORT).show();
                sid=spinner.getSelectedItemPosition();

                TextView contact= (TextView) findViewById(R.id.textview5);
                if(sid==1)
                {
                    mailid="atulanilgaikwad12@gmail.com";
                    contact.setText("8879581260");
                    ((ImageButton)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
//                            callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8879581260"));
//                            startActivity(callIntent);
                            dialContactPhone("8879581260");
                        }
                    });

                }
                else if(sid==2)
                {
                    mailid="joshiaditya184@gmail.com";
                    contact.setText("9823176079");
                    ((ImageButton)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                          //  callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9823176079"));
                            //startActivity(callIntent);
                            dialContactPhone("9823176079");
                        }
                    });

                }
                else if(sid==3)
                {
                    mailid="bhaveshsonawane118@gmail.com";
                    contact.setText("8446952790");
                    ((ImageButton)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "8446952790"));
                            //startActivity(callIntent);
                            dialContactPhone("8446952790");
                        }
                    });

                }
                else
                {
                    contact.setText("");
                }


            }

            private void dialContactPhone(final String phoneNumber) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Please Select your Category", Toast.LENGTH_LONG).show();
            }
        });
        submit.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){

                //String toS=to.getText().toString();
                String subS = subject.getText().toString();
                String feedS = feedback.getText().toString();
                Intent intent = null;

                if (subS.isEmpty() == false && feedS.isEmpty() == false) {
                    startActivity(Intent.createChooser(intent, "Choose an Email client :"));
                }
                else if (status==false) {
                    Toast.makeText(getApplicationContext(),"Select Your Category",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please fill above information", Toast.LENGTH_LONG).show();
                }
                if(sid!=0) {
                    intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mailid, null));
                    intent.putExtra(Intent.EXTRA_SUBJECT, subS);
                    intent.putExtra(Intent.EXTRA_TEXT, feedS);
                }


            }
        });
        spinner.getOnItemSelectedListener();
    }


}
