package com.example.admin.viewpagersample;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 2016/4/28.
 */
public class TwoPage extends Page {

    private static final String LOG_TAG = "TwoPage";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = "Two";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.e(LOG_TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment_page, null);
    }
}
