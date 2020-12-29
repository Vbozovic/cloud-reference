package com.refference.textgenerator.client;

import com.refference.textgenerator.dto.NumberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class NumberClient {

    private final RestTemplate restTemplate;

    public NumberDto getRandomNumber(int bound){
        var response =  restTemplate.getForObject("http://number-service/bound/"+bound, NumberDto.class,new HashMap<>());
        return response;
    }

}
