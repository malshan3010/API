// package com.example01.demo01;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// @RestController 
// public class Demo01Application {

// 	public static void main(String[] args) {
// 		SpringApplication.run(Demo01Application.class, args);
// 	}


// 	 @GetMapping("/hello")
//     public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
// 		return "Hello, " + name + "!";
//     }

// }


package com.example01.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Demo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

    // // 1. Simple greeting endpoint
    // @GetMapping("/greet")
    // public String greet() {
    //     return "Welcome to Spring Boot!";
    // }

    // 2 & 3. Greeting with path variable and optional query parameter
    @GetMapping("/greet/{name}")
    public String greetWithMessage(@PathVariable String name,
                                   @RequestParam(value = "message", defaultValue = "Welcome to Spring Boot!") String message) {
        return "Hello " + name + "! " + message;
    }
}


