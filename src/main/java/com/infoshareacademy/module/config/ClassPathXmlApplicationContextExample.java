package com.infoshareacademy.module.config;

import com.infoshareacademy.module.config.beans.SpringBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextExample {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");

        SpringBean1 springBean1 = context.getBean(SpringBean1.class);

        springBean1.sayHello();
    }

}
