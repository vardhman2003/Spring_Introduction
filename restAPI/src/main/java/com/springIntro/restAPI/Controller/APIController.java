package com.springIntro.restAPI.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {
    //Create a Rest Controller to demonstrate the various HTTP Methods and respond
    //hello messages to the User. To begin
    //with show Hello from BridgeLabz.
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    //Make REST Call to show Hello {name} from BridgeLabz
    @GetMapping("/hello/query")
    public String query(@RequestParam("name") String mark){
        return "Hello "+mark+" from Bridgelabz";
    }

    @GetMapping("/hello/param/{name}")
    public String hello(@PathVariable String name) {
        return "Hello "+name+" from Bridgelabz";
    }

    @PostMapping("/hello/post")
    public String greetUser(@RequestBody User user) {
       return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    //    Make REST Call to show Hello Mark Taylor from BridgeLabz put request
    @PutMapping("hello/put/{firstName}/")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}