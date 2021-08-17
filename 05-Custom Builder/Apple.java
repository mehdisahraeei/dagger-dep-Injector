package com.mahdi.dagger;

import android.util.Log;
import javax.inject.Inject;
import javax.inject.Named;


public class Apple implements Base {

    private static final String TAG = "pc";

    private int x;
    private int y;


    @Inject
    public Apple(@Named("X") int x, @Named("Y") int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void print() {
        Log.i(TAG, "first value: " + x + "\t" + "second value: " + y);
    }


}
