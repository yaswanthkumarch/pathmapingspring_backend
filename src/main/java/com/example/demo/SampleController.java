package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // GET method 1: Simple Hello World
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // GET method 2: Get a personalized message
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // GET method 3: Add two numbers (using path variables)
    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        int sum = num1 + num2;
        return "The sum of " + num1 + " and " + num2 + " is: " + sum;
    }

    // GET method 4: Display a static message
    @GetMapping("/status")
    public String getStatus() {
        return "The server is running successfully!";
    }

    // GET method 5: Return the square of a number
@GetMapping("/square")
public String getSquare(@RequestParam int number) {
    int result = number * number;  // Calculate the square of the number
    return "Square of the number is: " + result;  // Return the result as a String
}

}
