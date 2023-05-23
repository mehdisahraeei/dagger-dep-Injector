package com.mahdi.dagger;

import android.util.Log;
import javax.inject.Inject;

public class Perado {

    private static final String TAG = "run";


    @Inject
    public Perado() {
    }


    public void MethodPerado()
    {
        Log.i(TAG, "MethodPerado");
    }



}
