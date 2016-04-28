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
public class Tab extends Fragment {

    private static final String LOG_TAG = "Tab";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(LOG_TAG, "onCreateView");
        return inflater.inflate(R.layout.merge_footer_tab, null);
    }

}
