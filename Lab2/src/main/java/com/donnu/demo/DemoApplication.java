package com.donnu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/about")
    public String sayAbout() {
        return "About us";
    }

    @GetMapping("/options")
    public String sayOptions(@RequestParam(value = "myOption", defaultValue = "options") String name) {
        if(name.equals("options")){
            return name;
        }
        return "not an option";
    }
}
