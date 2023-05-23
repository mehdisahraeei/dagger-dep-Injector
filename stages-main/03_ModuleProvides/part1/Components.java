package com.mahdi.dagger;

import dagger.Component;

@Component(modules = BmvModule.class)
public interface Components {


    void setCar(MainActivity activity);

}
