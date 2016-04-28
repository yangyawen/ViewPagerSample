package com.example.admin.viewpagersample;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 2016/4/28.
 */
public class OnePage extends Page {

    private static final String LOG_TAG = "OnePage";

    public static OnePage newInstance(String title) {
        //通过Bundle保存数据
        Bundle args = new Bundle();
        args.putString("title", title);
        OnePage fragment = new OnePage();
        fragment.setTittle(title);
        //将Bundle设置为fragment的参数
        //fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(LOG_TAG, "onCreate");
        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.e(LOG_TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment_page, null);
    }
}
