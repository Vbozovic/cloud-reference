package com.refference.numberservice.controller;

import com.refference.numberservice.dto.NumberDto;
import com.refference.numberservice.dto.NumbersDto;
import com.refference.numberservice.service.RandomNumberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class NumberController {

    private final RandomNumberService numberService;


    @GetMapping("/bound/{bound}")
    public ResponseEntity<NumberDto> getNumber(@PathVariable("bound") Integer bound){
        return ResponseEntity.ok(new NumberDto(numberService.getIntegers(1,bound).get(0)));
    }

    @GetMapping("/numbers/{amount}")
    public ResponseEntity<NumbersDto> getAmount(@PathVariable("amount") Integer amount){
        return ResponseEntity.ok(new NumbersDto(numberService.getIntegers(amount,Integer.MAX_VALUE)));
    }

    @GetMapping("/numbers/{amount}/bound/{bound}")
    public ResponseEntity<NumbersDto> getNumbers(@PathVariable("amount") Integer amount, @PathVariable("bound") Integer bound){
        return ResponseEntity.ok(new NumbersDto(numberService.getIntegers(amount,bound)));
    }

}
