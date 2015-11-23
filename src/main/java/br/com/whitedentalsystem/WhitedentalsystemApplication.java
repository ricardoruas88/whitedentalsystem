package br.com.whitedentalsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.whitedentalsystem.domain")
@EnableJpaRepositories("br.com.whitedentalsystem.repository")
@ComponentScan({ "br.com.whitedentalsystem.service", "br.com.whitedentalsystem.controller" })
public class WhitedentalsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhitedentalsystemApplication.class, args);
    }
}
