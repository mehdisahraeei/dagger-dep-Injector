package com.mahdi.dagger;


import javax.inject.Inject;


public class Car {

    private static final String TAG = "run";

    @Inject
    Pride pride;

    @Inject
    Perado perado;



    @Inject
    public Car() {
    }


    @Inject
    public void Method1()
    {
        pride.MethodPride();
        perado.MethodPerado();
        new Other().ExtraMethod(this);
    }


}
