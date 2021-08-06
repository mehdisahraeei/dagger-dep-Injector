package com.mahdi.dagger.department;

import android.util.Log;

import javax.inject.Inject;

public class young implements engine{

    private static final String TAG = "run";

    @Inject
    public young() {
    }

    @Override
    public void print() {
        Log.i(TAG, "run");
    }
}
