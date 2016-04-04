package org.moto.Application;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.moto.Controller")
public class App {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(App.class,args);
    }
}
