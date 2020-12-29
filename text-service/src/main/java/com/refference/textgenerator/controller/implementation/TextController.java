package com.refference.textgenerator.controller.implementation;

import com.refference.textgenerator.controller.declaration.ITextController;
import com.refference.textgenerator.service.implementation.RandomTextService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TextController implements ITextController {

    private final RandomTextService randomTextService;

    @Override
    public String getText() {
        return randomTextService.randomWord();
    }
}
