package com.refference.textgenerator.service.specification;

public interface IRandomTextService {

    String randomWord();
    String randomWord(int bound);

    String randomSentence();
    String randomSentence(int wordBound);

}
