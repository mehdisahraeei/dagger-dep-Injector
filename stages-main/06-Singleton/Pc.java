package com.mahdi.dagger;

import android.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Pc {

    private static final String TAG = "Apple";



    @Inject
    Apple apple;


    @Inject
    public Pc() {
    }


    public void Display()
    {
        Log.i(TAG,"Pc: " + this + "\n");
        Log.i(TAG,"Apple: " + apple + "\n");
    }



}
