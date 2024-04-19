package dev.carm.sistemaescolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSistemaEscolarApplication {

    public static void main(String[] args) {
        SpringApplication.from(SistemaEscolarApplication::main).with(TestSistemaEscolarApplication.class).run(args);
    }

}
