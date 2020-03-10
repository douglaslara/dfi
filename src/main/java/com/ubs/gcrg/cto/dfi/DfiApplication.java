package com.ubs.gcrg.cto.dfi;

import com.ubs.gcrg.cto.dfi.service.InventoryService;
import java.util.Collections;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DfiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DfiApplication.class, args);
    }

    @Bean
    InventoryService getInventoryService() {
        return new InventoryService() {
            @Override
            public List<String> listFlows() {
                return Collections.singletonList("Hello World");
            }
        };
    }

}