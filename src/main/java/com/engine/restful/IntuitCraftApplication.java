package com.engine.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * Main spring boot application starter class.
 *
 * @author YathisH
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class IntuitCraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntuitCraftApplication.class, args);
    }

}
