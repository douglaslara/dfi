package com.ubs.gcrg.cto.dfi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/dfi")
public class DataFlowInventoryEndpoint {

    @GetMapping
    public List<String> getInventory(){
        return Collections.singletonList("Hello World");
    }
}
