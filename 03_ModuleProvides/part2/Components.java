package com.mahdi.dagger;

import dagger.Component;

@Component(modules = engineModule.class)
public interface Components {


    void setCar(MainActivity activity);

}
