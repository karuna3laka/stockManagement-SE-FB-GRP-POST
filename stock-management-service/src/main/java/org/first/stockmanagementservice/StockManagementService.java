package org.first.stockmanagementservice;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.first.stockmanagementservice.repository")
public class StockManagementService
{

    public static void main(String[] args) {
        SpringApplication.run( StockManagementService.class, args);

    }

























}