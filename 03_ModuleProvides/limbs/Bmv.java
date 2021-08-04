package com.mahdi.dagger.limbs;

import android.util.Log;

public class Bmv {

    private static final String TAG = "run";


    public Branch1 branch1;
    public Branch2 branch2;


    public Bmv(Branch1 branch1, Branch2 branch2) {
        this.branch1 = branch1;
        this.branch2 = branch2;
    }

    public void MethodBmv()
    {
        Log.e(TAG, "MethodBmv");
    }


}
