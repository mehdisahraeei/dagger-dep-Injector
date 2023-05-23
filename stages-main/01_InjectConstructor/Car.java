package com.mahdi.dagger.InjectConstructor;

import android.util.Log;
import javax.inject.Inject;


public class Car {


    private static final String TAG = "run";


    @Inject
    public Car() {
        Log.i(TAG, "start");
    }



    public void Method1()
    {
        Log.i(TAG, "First Method was started.");
    }



}
