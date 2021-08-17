package com.mahdi.dagger;

import javax.inject.Named;
import dagger.BindsInstance;
import dagger.Component;


@Component(modules = ModuleBase.class)
public interface ComponentPC {


    void setThis(MainActivity mainActivity);


    @Component.Builder
    interface Builder
    {

        @BindsInstance
        Builder setX(@Named("X") int x);

        @BindsInstance
        Builder setY(@Named("Y") int y);

        ComponentPC build();
    }



}
