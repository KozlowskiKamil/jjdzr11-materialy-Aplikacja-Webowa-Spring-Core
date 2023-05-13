package com.infoshareacademy.module.exercise01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CoffeeVendingMachine bean = context.getBean(CoffeeVendingMachine.class);
        bean.getCoffee();
    }

}
