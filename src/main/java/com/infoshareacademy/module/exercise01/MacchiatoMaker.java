package com.infoshareacademy.module.exercise01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MacchiatoMaker")
//@Profile("MacchiatoMaker")
public class MacchiatoMaker implements CoffeeMaker {

    @Override
    public void getCoffee() {
        System.out.println("MacchiatoMaker");
    }

}
