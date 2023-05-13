package com.infoshareacademy.module.exercise01;

import org.springframework.stereotype.Component;

//@Component
public class MacchiatoMaker implements CoffeeMaker{

    @Override
    public void getCoffee() {
        System.out.println("MacchiatoMaker");
    }

}
