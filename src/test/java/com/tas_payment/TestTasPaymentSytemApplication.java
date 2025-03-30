package com.tas_payment;

import org.springframework.boot.SpringApplication;

public class TestTasPaymentSytemApplication {

    public static void main(String[] args) {
        SpringApplication.from(TasPaymentSytemApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
