package com.xiaobai.controller;

import com.google.gson.Gson;
import com.xiaobai.idCard.Person;
import com.xiaobai.idCard.PersonFromId;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ddd")
@RestController
public class IdCardController {
    @RequestMapping(method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public String home (@RequestParam(value = "idCard", required = false) @PersonFromId Person person) {
        return new Gson().toJson(person);
    }
}