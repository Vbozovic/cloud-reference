package com.refference.numberservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RandomNumberService {

    private final Random rand;

    public List<Integer> getIntegers(int amount,int bound){
        return IntStream.range(0,amount)
                .mapToObj(i->rand.nextInt(bound))
                .collect(Collectors.toList());
    }

}
