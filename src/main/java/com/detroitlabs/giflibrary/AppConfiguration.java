package com.detroitlabs.giflibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan


public class AppConfiguration {


    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class, args);

    }
}
