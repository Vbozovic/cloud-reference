package com.refference.textgenerator.service.implementation;

import com.refference.textgenerator.client.NumberClient;
import com.refference.textgenerator.service.specification.IRandomTextService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RandomTextService implements IRandomTextService {

    private final NumberClient numberClient;

    @Override
    public String randomWord() {
        return RandomStringUtils.randomAlphanumeric(numberClient.getRandomNumber(20).getNumber());
    }

    @Override
    public String randomWord(int bound) {
        return null;
    }

    @Override
    public String randomSentence() {
        return null;
    }

    @Override
    public String randomSentence(int wordBound) {
        return null;
    }
}
