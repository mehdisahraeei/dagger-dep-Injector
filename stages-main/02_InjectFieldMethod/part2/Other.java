package com.mahdi.dagger;

import android.util.Log;
import javax.inject.Inject;

public class Other {


    private static final String TAG = "run";


    @Inject
    public Other() {
    }

    public void ExtraMethod(Car car)
    {
        Log.i(TAG, "ExtraMethod");
    }

}
