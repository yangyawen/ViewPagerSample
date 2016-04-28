package com.example.admin.viewpagersample;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.List;

/**
 * Created by admin on 2016/4/28.
 */
public class ViewPagerAdapter
        extends FragmentPagerAdapter {

    private static final String LOG_TAG = "ViewPagerAdapter";

    Toolbar toolbar;
    List<Page> pageList;
    ViewPager viewPager;

    public ViewPagerAdapter(AppCompatActivity activity, List<Page> pageList, ViewPager viewPager) {
        super(activity.getSupportFragmentManager());
        this.pageList = pageList;
        //this.viewPager = viewPager;

    }

    @Override
    public Page getItem(int position) {
        Log.e(LOG_TAG, "getItem: " + position + "  " + pageList.get(position).getClass().getSimpleName());
        return pageList.get(position);
    }

    @Override
    public int getCount(){
        return pageList.size();
    }

}
