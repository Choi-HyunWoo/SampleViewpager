package com.hw.corcow.sampleviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new MyPagerAdapter();
        pager.setAdapter(mAdapter);

        pager.setCurrentItem(3, false);
    }
}
