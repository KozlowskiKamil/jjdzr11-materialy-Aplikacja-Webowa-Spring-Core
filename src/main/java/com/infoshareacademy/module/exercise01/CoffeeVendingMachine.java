package com.infoshareacademy.module.exercise01;

import org.springframework.stereotype.Component;

@Component
public class CoffeeVendingMachine {

    private final CoffeeMaker coffeeMaker;

    public CoffeeVendingMachine(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void getCoffee() {
        coffeeMaker.getCoffee();
    }

}
