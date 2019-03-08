package com.engine.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * Main spring boot application starter class.
 *
 * @author YathisH
 */
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, SecurityAutoConfiguration.class})
public class RestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulApplication.class, args);
    }

}
