package com.mahdi.dagger;

import com.mahdi.dagger.InjectConstructor.Car;
import dagger.Component;

@Component
public interface Components {

    Car getCar();


}
