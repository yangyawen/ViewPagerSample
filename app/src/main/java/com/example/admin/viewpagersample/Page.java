package com.example.admin.viewpagersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 2016/4/28.
 */
public abstract class Page extends Fragment {

    private static final String LOG_TAG = "Page";
    protected String title;

    protected void setTittle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }
}
