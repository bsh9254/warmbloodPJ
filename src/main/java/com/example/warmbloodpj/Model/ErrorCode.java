package com.example.warmbloodpj.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    INVALID_LENGTH("INVALID_LENGTH", "글자 수 초과");


    private final String code;
    private final String message;
}
