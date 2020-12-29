package com.refference.textgenerator.controller.declaration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/greetings")
public interface IGreetingController {

    @GetMapping("/hello")
    String helloWorld();

    @GetMapping("/name/{name}")
    String helloWithName(@PathVariable("name") String name);

}
