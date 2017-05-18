package vishal_shirke.finalapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SearchView;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static boolean a=false;
    int i1,i2,i3,i4;
    String strFiestName,strSummary,strStats;
    Locale myLocale;
    ImageView ivPics;
    private CustomzedAdapter adapter;
    ViewPager viewpagerCustomized;
    int currentPage = 0;
    Handler handler;
    Runnable Update;
    boolean flag = false;
    RelativeLayout rr;
    CardView card11;
    CardView card22;
    CardView card33;
    CardView card44;
    CardView card55;
    Activity activity;
    SearchView searchView;

    //AutoCompleteTextView actv;
    //String[] language ={"beggging","crying","fees","education","harassment","offence","children","protection","adult","authority"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //cardviews of the home screen
        card11 = (CardView) findViewById(R.id.card1);
        card22 = (CardView) findViewById(R.id.card2);
        card33 = (CardView) findViewById(R.id.card3);
        card44 = (CardView) findViewById(R.id.card4);
        //card55 = (CardView) findViewById(R.id.card5);
        activity=MainActivity.this;

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        //Creating the instance of ArrayAdapter containing list of language names
//        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
//                (this,android.R.layout.select_dialog_item,language);
//        //Getting the instance of AutoCompleteTextView
//       actv= (AutoCompleteTextView)findViewById(R.id.auto);
//        actv.setThreshold(1);//will start working from first character
//        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
//
//        actv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
        viewpagerCustomized = (ViewPager) findViewById(R.id.viewpagerCustomized);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getViewPagerContent();
        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action to be performed on first card click
                //that is moving to next acts screen
                Intent intent = new Intent(MainActivity.this, grid_view.class);
                startActivity(intent);
            }
        });
        card33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action to be performed on third card click
                //that is moving to next newfeed screen
                Intent intent = new Intent(MainActivity.this, newsfeed.class);
                startActivity(intent);
            }
        });
        card22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //action to be performed on second card click
                //that is moving to next rights screen
                Intent intent = new Intent(MainActivity.this, rights.class);
                startActivity(intent);
            }
        });
//        card55.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,SpinnerActivity.class);
//                startActivity(intent);
//            }
//        });
        card44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //action to be performed on second card click
                //that is moving to next rights screen
                Intent intent = new Intent(MainActivity.this, videolist.class);
                startActivity(intent);
            }
        });
//            t1=(TextView)findViewById(R.id.text1);
//        Typeface tf=Typeface.createFromAsset(getAssets(),"fonts/hotpizza.ttf");
//        t1.setTypeface(tf);
//
//        t2=(TextView)findViewById(R.id.text2);
//        Typeface tf1=Typeface.createFromAsset(getAssets(),"fonts/fun_raiser.ttf");
//        t2.setTypeface(tf1);
//
//        t3=(TextView)findViewById(R.id.text3);
//        Typeface tf2=Typeface.createFromAsset(getAssets(),"fonts/droidserif_italic.ttf");
//        t3.setTypeface(tf2);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    public void setLocale(String lang) {

        //this method is for localization i.e for multi language purpose
        //string from this method will convert all strings to particular language
        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        finish();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.ncpcr) {
              //actv.setVisibility(View.VISIBLE);
       Intent intentN;
            intentN =new Intent(MainActivity.this,webngo.class);
            intentN.putExtra("url","http://www.ncpcr.gov.in");
            startActivity(intentN);
        }

        return super.onOptionsItemSelected(item);
    }

    public  void ShowMessage() {

        //This is the method for dialog box asking to choose language

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater =
                getLayoutInflater();
        View dialogLayout = inflater
                .inflate(R.layout.dialogbox, null);

        final AlertDialog dialog = builder.create();
        dialog.getWindow()
                .setSoftInputMode(
                        WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        dialog.setView(dialogLayout, 0, 0, 0, 0);
        WindowManager.LayoutParams wlmp = dialog.getWindow()
                .getAttributes();
        wlmp.gravity = Gravity.CENTER;

        RelativeLayout realHin = (RelativeLayout) dialogLayout
                .findViewById(R.id.realHin);

        RelativeLayout realEn = (RelativeLayout) dialogLayout
                .findViewById(R.id.realEn);


        realHin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //on selecting hindi from dialog box, locale 'hi' will be passed to setLocale method
                    setLocale("hi");
                    a=true;
                    Toast.makeText(getApplicationContext(), getString(R.string.toast)+"", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        realEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    //on selecting english from dialog box, locale 'en' will be passed to setLocale method
                    setLocale("en");
                    a=false;
                    Toast.makeText(getApplicationContext(),getString(R.string.toast)+"",Toast.LENGTH_LONG).show();
                    //dialog.dismiss();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        builder.setView(dialogLayout);
        try {
            if (!(dialog.isShowing())) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

             public void getViewPagerContent() {

        if(a)
        {
            // if condition for checking locale
            // Array for images
            int[] pics = {
                    R.drawable.one,
                    R.drawable.two,
                    R.drawable.three,
                    R.drawable.four,
                    R.drawable.five,
                    R.drawable.six,
                    R.drawable.seven,
                    R.drawable.eight,
                    R.drawable.nine,
                    R.drawable.ten,
                    R.drawable.eleven,
                    R.drawable.twelve,
                    R.drawable.thirteen,
                    R.drawable.fourteen,
                    R.drawable.fifteen,
                    R.drawable.sixteen,
                    R.drawable.seven,
                    R.drawable.eight,
                    R.drawable.nine
            };



            // To adapt the images to view pager
            adapter = new CustomzedAdapter(this, pics);
            viewpagerCustomized.setAdapter(adapter);
            viewpagerCustomized.setCurrentItem(0);

            handler = new Handler();
            Update = new Runnable() {
                public void run() {

                    if (!flag) {
                        currentPage = currentPage + 1;
                        if (currentPage >= 18) {
                            currentPage = 17;
                            flag = true;
                        }
                    } else {
                        currentPage = currentPage - 1;
                        if (currentPage <= 0) {
                            currentPage = 0;
                            flag = false;
                        }
                    }
                    viewpagerCustomized.setCurrentItem(currentPage, true);

                    // setting time to pause the image
                    handler.postDelayed(Update, 3000);

                }
            };

        }
        else {
            int[] pics = {
                    R.drawable.e_fifteen,
                    R.drawable.e_one,
                    R.drawable.e_two,
                    R.drawable.e_three,
                    R.drawable.e_four,
                    R.drawable.dyk5,
                    R.drawable.e_five,
                    R.drawable.e_six,
                    R.drawable.e_seven,
                    R.drawable.e_eight,
                    R.drawable.e_nine,
                    R.drawable.e_ten,
                    R.drawable.e_eleven,
                    R.drawable.e_twelve,
                    R.drawable.dyk10,
                    R.drawable.e_thirteen,
                    R.drawable.e_fourteen,
                    R.drawable.e_fifteen,
                    R.drawable.e_sixteen
            };

            // To adapt the images to view pager
            adapter = new CustomzedAdapter(this, pics);
            viewpagerCustomized.setAdapter(adapter);
            viewpagerCustomized.setCurrentItem(0);

            handler = new Handler();
            Update = new Runnable() {
                public void run() {

                    if (!flag) {
                        currentPage = currentPage + 1;
                        if (currentPage >= 17) {
                            currentPage = 16;
                            flag = true;
                        }
                    } else {
                        currentPage = currentPage - 1;
                        if (currentPage <= 0) {
                            currentPage = 0;
                            flag = false;
                        }
                    }
                    viewpagerCustomized.setCurrentItem(currentPage, true);
                    // setting time to pause the image
                    handler.postDelayed(Update, 3000);

                }
            };
        }
    }


    @Override
    public void onPause() {
        super.onPause();
        if (handler != null) {
            handler.removeCallbacks(Update);
        }
    }

    @Override
    public void onResume() {
        super.onResume();  // call to the superclass method first
        handler.postDelayed(Update, 3000);
    }

    private void displaySelectedmenu(int id) {
        android.support.v4.app.Fragment fragment = null;
        switch (id) {
            // On selecting home option from Drawer
            // Home screen will be called directly
            case R.id.nav_home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_acts:
                // On selecting acts option from Drawer
                // Home screen will be called directly
                Intent intent1 = new Intent(this, grid_view.class);
                startActivity(intent1);
                break;
            case R.id.nav_share:
                // On selecting share option from Drawer
                // Home screen will be called directly
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "Share app via"));
                startActivity(sendIntent);
                break;
            case R.id.nav_language:
                // On selecting Language option from Drawer
                // Home screen will be called directly
                ShowMessage();
                break;
            case R.id.nav_newsfeed:
                // On selecting news feed option from Drawer
                // Home screen will be called directly
                Intent intent3 = new Intent(this, newsfeed.class);
                startActivity(intent3);
                break;
            case R.id.nav_rights:
                // On selecting rights option from Drawer
                // Home screen will be called directly
                Intent intent4 = new Intent(this, rights.class);
                startActivity(intent4);
                break;
            case R.id.implinks:
                // On selecting rights option from Drawer
                // Home screen will be called directly
                Intent intent5 = new Intent(this, implink.class);
                startActivity(intent5);
                break;
            case R.id.nav_about:
                // On selecting rights option from Drawer
                // Home screen will be called directly
                Intent intent6 = new Intent(this, About_us.class);
                startActivity(intent6);
                break;
            case R.id.nav_raise:
                Intent i7=new Intent(this,feedback.class);
                startActivity(i7);
                break;
            case R.id.nav_ngo:
                Intent i8=new Intent(this,SpinnerActivity.class);
                startActivity(i8);
                break;
        }
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.appBarLayout, fragment);
            ft.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        displaySelectedmenu(id);

        return true;
    }

}
