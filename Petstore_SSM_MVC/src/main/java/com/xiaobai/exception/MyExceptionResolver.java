package com.xiaobai.exception;

import org.springframework.beans.TypeMismatchException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver extends AbstractHandlerExceptionResolver {
    @Override
    protected ModelAndView doResolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        if(e instanceof TypeMismatchException){
            return new ModelAndView("shujukucuowu");
        } else if(e instanceof Exception){
            return new ModelAndView("qitacuowu");
        }
        return null;
    }
}
