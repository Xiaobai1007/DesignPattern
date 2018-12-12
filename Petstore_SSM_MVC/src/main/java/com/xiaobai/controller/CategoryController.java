package com.xiaobai.controller;

import com.google.gson.Gson;
import com.xiaobai.dao.CategoryMapper;
import com.xiaobai.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/category")
@Controller
public class CategoryController {

    @Autowired
    CategoryMapper categoryMapper;

    @InitBinder
    public void init (WebDataBinder binder) {
        CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }

    @GetMapping(produces = "application/json;charset=utf-8")
    @ResponseBody
    public String selectfindAll(){
        List<Category> categoryList = categoryMapper.selectAll();
        return new Gson().toJson(categoryList);
    }

    // 下面这些注解，只能作用于本类之中

    @ExceptionHandler(Exception.class)
    public String handlerException(Exception ex, Model model, WebRequest request){
        model.addAttribute("err", ex.getMessage());
        return "err1";// 默认返回 status 200
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "数据库错误")
    public ModelAndView handlerException2(){
        return new ModelAndView("err2");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerException3(){
        // 返回一个字符串
        return ResponseEntity.status(333).body("daihkskdhfa");
    }
}
