package com.infoshareacademy.module.config;

import com.infoshareacademy.module.config.beans.ConfigurationComponentScan;
import com.infoshareacademy.module.config.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConfigurationComponentScan.class
        );

        SpringBean1 bean = context.getBean(SpringBean1.class);

        bean.sayHello();
    }
}
