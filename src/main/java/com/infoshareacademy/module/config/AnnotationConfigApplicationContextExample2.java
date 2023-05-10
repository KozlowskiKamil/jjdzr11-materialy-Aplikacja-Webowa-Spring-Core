package com.infoshareacademy.module.config;

import com.infoshareacademy.module.config.beans.SpringBean1;
import com.infoshareacademy.module.config.defined.configuration.ConfigurationStatic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConfigurationStatic.class
        );

        SpringBean1 bean = context.getBean(SpringBean1.class);

        bean.sayHello();
    }
}
