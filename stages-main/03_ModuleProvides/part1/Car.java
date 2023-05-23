package com.mahdi.dagger;

import com.mahdi.dagger.limbs.Bmv;
import javax.inject.Inject;


public class Car {

    private static final String TAG = "run";

    @Inject
    Bmv bmv;


    @Inject
    public Car() {
    }

    @Inject
    public void display()
    {
        bmv.MethodBmv();
        bmv.branch1.MethodBranch1();
        bmv.branch2.MethodBranch2();
    }


}
