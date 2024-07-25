package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example.*")
@SpringBootApplication
public class MailApplication {
    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class);
    }
}