package com.refference.textgenerator.controller.implementation;

import com.refference.textgenerator.controller.declaration.IGreetingController;
import com.refference.textgenerator.service.specification.IRandomTextService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController implements IGreetingController {

    @Override
    public String helloWorld() {
        return "Hello world";
    }

    @Override
    public String helloWithName(String name) {
        return "Hello "+name;
    }

}
