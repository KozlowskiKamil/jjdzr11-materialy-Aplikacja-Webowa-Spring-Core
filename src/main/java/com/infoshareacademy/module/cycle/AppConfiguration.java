package com.infoshareacademy.module.cycle;

import com.infoshareacademy.module.cycle.beans.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfiguration {

    @Bean
    public SpringBean1 getSpringBean1() {
        return new SpringBean1();
    }

}
