package com.infoshareacademy.module.exercise01;

import org.springframework.stereotype.Component;

@Component
public class EspressoMaker implements CoffeeMaker {

    @Override
    public void getCoffee() {
        System.out.println("EspressoMaker getCoffee");
    }

}
