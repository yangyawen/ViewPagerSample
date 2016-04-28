package com.example.admin.viewpagersample;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity
        extends AppCompatActivity
        implements ViewPager.OnPageChangeListener{

    private static final String LOG_TAG = "MainActivity";

    @Bind(R.id.viewPager) ViewPager viewPager;
    @Bind(R.id.toolbar) Toolbar toolbar;
    @Bind(R.id.title) TextView toolbarTitle;
    private ViewPagerAdapter adapter;

    private List<Page> pageList;
    private List<Tab> tabList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Toolbar
        setSupportActionBar(toolbar);
        //toolbar.setTitle("uuu");
        toolbar.setNavigationIcon(R.drawable.btn_back);

        initPageList();
        initViewPager();

    }

    private void initPageList() {
        pageList = new ArrayList<>();

        OnePage onePage = OnePage.newInstance("One");
        pageList.add(onePage);
        TwoPage twoPage = new TwoPage();
        pageList.add(twoPage);
        ThreePage threePage = new ThreePage();
        pageList.add(threePage);
        FourPage fourPage = new FourPage();
        pageList.add(fourPage);

    }

    private void initViewPager() {
        adapter = new ViewPagerAdapter(this, pageList, viewPager);
        viewPager.addOnPageChangeListener(this);
        viewPager.setCurrentItem(0, false);
        onPageSelected(0);
        viewPager.setAdapter(adapter);
    }

    /*
    private void initTabs() {
        tabList = new ArrayList<>();

        for (int i=0; i<4; i++) {
            Tab tab1 = new Tab();
            tab1 = (fragment)findViewById(R.id.tab1);
        }
        Tab tab1 = new Tab();
        tab1 = (fragment)findViewById(R.id.tab1);
    }*/

    private void setToolbarTitle(String title) {
        toolbarTitle.setText(title);

    }

    @Override
    public void onPageSelected(int position) {
        Log.e(LOG_TAG, "onPageSelected: "+position + " " +adapter.getItem(position).getTitle());
        setToolbarTitle(adapter.getItem(position).getTitle());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }
}
