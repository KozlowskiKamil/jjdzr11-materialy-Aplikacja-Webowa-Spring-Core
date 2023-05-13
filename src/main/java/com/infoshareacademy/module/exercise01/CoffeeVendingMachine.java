package com.infoshareacademy.module.exercise01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeeVendingMachine {

    private final CoffeeMaker coffeeMaker;

    public CoffeeVendingMachine(@Qualifier("MacchiatoMaker") CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void getCoffee() {
        coffeeMaker.getCoffee();
    }

}
