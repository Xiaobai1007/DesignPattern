package com.xiaobai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component
@ControllerAdvice
public class AllControllerAdvice {
    // 这个处理，对所有的Controller 都会有效
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.URI_TOO_LONG)
    @ResponseBody
    public String handlerDbException(){
        return "ahsdlfja";
    }

    @ExceptionHandler(RuntimeException.class)
    public String handlerDbException2(){
        return "runtime";
    }
}
