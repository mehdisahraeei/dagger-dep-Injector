package com.mahdi.dagger;

import com.mahdi.dagger.department.engine;
import javax.inject.Inject;


public class Car {

    private static final String TAG = "run";


    @Inject
    engine engine;


    @Inject
    public Car() {
    }


    @Inject
    public void display()
    {
        engine.print();
    }


}
