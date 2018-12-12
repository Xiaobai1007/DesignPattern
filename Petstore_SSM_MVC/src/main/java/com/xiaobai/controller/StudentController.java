package com.xiaobai.controller;

import com.google.gson.Gson;
import com.xiaobai.entity.Result;
import com.xiaobai.entity.Student;
import com.xiaobai.service.StudentMapperImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RequestMapping("/ddd")
@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentMapperImp studentMapperImp;

    @GetMapping("/stu")
    @ResponseBody
    public Result<Student> all(){
        Result<Student> result = new Result<Student>();
        try {
            Student student = studentMapperImp.getStudent();
            result.setCode(202);
            result.setData(student);
            return result;
        } catch (RuntimeException e){
            result.setCode(403);
            result.setErrMsg(e.getMessage());
            return result;
        }
    }

}
