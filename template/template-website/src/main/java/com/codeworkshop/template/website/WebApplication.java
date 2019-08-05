package com.codeworkshop.template.website;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebApplication.class);


    @Override
    public void run(String... args) throws Exception {

    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        LOGGER.info("Demo started!");
    }
}
