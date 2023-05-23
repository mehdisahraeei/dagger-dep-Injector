package com.mahdi.dagger;

import android.util.Log;
import javax.inject.Inject;

public class Pride {


    private static final String TAG = "run";


    @Inject
    public Pride() {
    }


    public void MethodPride()
    {
        Log.i(TAG, "MethodPride");
    }


}
