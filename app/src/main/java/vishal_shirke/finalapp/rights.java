/*
 * Copyright (C) 2016 Frederik Schweiger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vishal_shirke.finalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import link.fls.swipestack.SwipeStack;

public class rights extends AppCompatActivity implements SwipeStack.SwipeStackListener, View.OnClickListener {

    //    private Button mButtonLeft, mButtonRight;
//    private FloatingActionButton mFab;
    TextView t1,t2;
    private ArrayList<String> mData;
    private ArrayList<Integer> mData1;
    private ArrayList<String> mData2;
    //    private ArrayList<Integer> mData1;
    private SwipeStack mSwipeStack;
    private SwipeStackAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rightsactivity_main);

        mSwipeStack = (SwipeStack) findViewById(R.id.swipeStack);
        mData = new ArrayList<>();// Arraylist for retrieving title strings
        mData1=new ArrayList<>();// Arraylist for retrieving Images
        mData2=new ArrayList<>(); // Arraylist for retrieving content strings

        // making adpation between stack
        mAdapter = new SwipeStackAdapter(mData,mData1,mData2);
        mSwipeStack.setAdapter(mAdapter);
        mSwipeStack.setListener(this);
//        t1=(TextView)findViewById(R.id.textViewCard);
//        Typeface tf=Typeface.createFromAsset(getAssets(),"fonts/hotpizza.ttf");
//        t1.setTypeface(tf);
        fillWithTestData();

    }

    private void fillWithTestData() {

        // Putting Title,Images,Content into respective arraylists

        for (int x = 0; x < 50; x++) {

            // Arraylist for titles
            mData.add(0,getString(R.string.right0)+"");
            mData.add(1,getString(R.string.right1)+"");
            mData.add(2,getString(R.string.right2)+"");
            mData.add(3,getString(R.string.right3)+"");
            mData.add(4,getString(R.string.right4)+"");
            mData.add(5,getString(R.string.right5)+"");
            mData.add(6,getString(R.string.right6)+"");
            mData.add(7,getString(R.string.right7)+"");
            mData.add(8,getString(R.string.right8)+"");
            mData.add(9,getString(R.string.right9)+"");

            // Arraylist for images
            mData1.add(0,R.drawable.rights1);
            mData1.add(1,R.drawable.rights2);
            mData1.add(2,R.drawable.right3);
            mData1.add(3,R.drawable.right4);
            mData1.add(4,R.drawable.right5);
            mData1.add(5,R.drawable.right6);
            mData1.add(6,R.drawable.right7);
            mData1.add(7,R.drawable.right8);
            mData1.add(8,R.drawable.right9);
            mData1.add(9,R.drawable.right10);

            // Arraylist for Content
            mData2.add(0,getString(R.string.right10)+"");
            mData2.add(1,getString(R.string.right11)+"");
            mData2.add(2,getString(R.string.right12)+"");
            mData2.add(3,getString(R.string.right13)+"");
            mData2.add(4,getString(R.string.right14)+"");
            mData2.add(5,getString(R.string.right15)+"");
            mData2.add(6,getString(R.string.right16)+"");
            mData2.add(7,getString(R.string.right17)+"");
            mData2.add(8,getString(R.string.right18)+"");
            mData2.add(9,getString(R.string.right19)+"");

        }
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onViewSwipedToRight(int position) {
    }

    @Override
    public void onViewSwipedToLeft(int position) {
//        String swipedElement = mAdapter.getItem(position);
//        Toast.makeText(this, getString(R.string.view_swiped_left, swipedElement),
//                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStackEmpty() {
        Toast.makeText(this, R.string.stack_empty, Toast.LENGTH_SHORT).show();
    }

    public class SwipeStackAdapter extends BaseAdapter {

        // Adaptig data to stack
        private List<String> mData;
        private List<Integer> mData1;
        private List<String>mData2;

        public SwipeStackAdapter(List<String> data, List<Integer> data1,List<String> data2) {

            this.mData1=data1;
            this.mData = data;
            this.mData2=data2;
        }

        @Override
        public int getCount() {

            return mData.size();
        }

        @Override
        public String getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.rightscard, parent, false);
            }

            // Viewing data to Imageview,Textviews
            ImageView imageView=(ImageView)convertView.findViewById(R.id.image);
            imageView.setImageResource(mData1.get(position));
            TextView textViewCard = (TextView) convertView.findViewById(R.id.textViewCard);
            textViewCard.setText(mData.get(position));
            TextView textViewCard1 = (TextView) convertView.findViewById(R.id.txtRightsCardInfo);
            textViewCard1.setText(mData2.get(position));

            return convertView;
        }

    }
}
