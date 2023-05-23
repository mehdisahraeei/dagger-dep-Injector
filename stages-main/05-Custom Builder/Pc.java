package com.mahdi.dagger;

import javax.inject.Inject;

public class Pc {

    @Inject
    Base base;


    @Inject
    public Pc() {
    }


    @Inject
    public void Display()
    {
        base.print();
    }



}
