package com.mahdi.dagger;

import android.util.Log;
import javax.inject.Inject;


public class Car {

    private static final String TAG = "run";


    @Inject
    public Car() {
    }


    @Inject
    public void Method1()
    {
        Log.i(TAG, "First Method was started with Inject.");
    }


}
