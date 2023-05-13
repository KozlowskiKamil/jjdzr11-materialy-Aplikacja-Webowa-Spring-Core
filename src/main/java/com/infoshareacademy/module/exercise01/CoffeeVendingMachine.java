package com.infoshareacademy.module.exercise01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoffeeVendingMachine {

    private CoffeeMaker coffeeMaker;

    @Autowired
    public void setCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void getCoffee() {
        coffeeMaker.getCoffee();
    }

}
