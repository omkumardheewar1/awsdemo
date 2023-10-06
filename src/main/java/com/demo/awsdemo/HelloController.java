package com.demo.awsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet() {



        //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
        return "Welcome to the AWS CI/CD Deployment Demo:::";
    }
}
