package com.rps.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Start {
    @GetMapping(path="/hello")

    public String start(){
        return "hello rps";

    }

}
