package com.xiaobai.service;

import com.xiaobai.entity.Student;
import org.springframework.stereotype.Service;

import java.net.ConnectException;
import java.util.Date;
import java.util.Random;

@Service
public class StudentMapperImp implements StudentMapper {
    @Override
    public Student getStudent() {
        Student student = new Student();
        student.setName("郭世棋");
        student.setAge(19);
        student.setSex("男");
        student.setBirthday(new Date());
        int i = new Random().nextInt();
        if (i % 2 == 0) {
            throw new RuntimeException("连接错误，你不能连接成双成对的");
        }

        return student;
    }
}
