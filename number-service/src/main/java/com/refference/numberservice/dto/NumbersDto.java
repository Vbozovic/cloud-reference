package com.refference.numberservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class NumbersDto {
    private List<Integer> numbers;
}
