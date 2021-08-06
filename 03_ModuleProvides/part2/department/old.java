package com.mahdi.dagger.department;

import javax.inject.Inject;

public class old implements engine {

    private static final String TAG = "run";

    @Inject
    public old() {
    }

    @Override
    public void print() {
//        Log.i(TAG, "run");
    }
}
