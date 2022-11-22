package com.example.warmbloodpj.Dto;

import com.example.warmbloodpj.Model.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto<T> {

    public boolean is_success;

    public T data;
    public ErrorCode errorCode;



    public static <T> ResponseDto<T> is_Success(T data)
    {
        return new ResponseDto<T>(true,data,null);
    }

    public static <T> ResponseDto<T> is_Fail(ErrorCode errorCode){return new ResponseDto<T>(false,null,errorCode);}
}