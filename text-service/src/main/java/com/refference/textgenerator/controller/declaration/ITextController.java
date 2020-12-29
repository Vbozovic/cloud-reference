package com.refference.textgenerator.controller.declaration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/text")
public interface ITextController {

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    String getText();

}
