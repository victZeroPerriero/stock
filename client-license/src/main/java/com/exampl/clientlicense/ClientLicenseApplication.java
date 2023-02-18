package com.exampl.clientlicense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientLicenseApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientLicenseApplication.class, args);
    }
}
