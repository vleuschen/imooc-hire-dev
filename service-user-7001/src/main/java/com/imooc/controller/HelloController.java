package com.imooc.controller;

import com.imooc.model.Stu;
import com.imooc.model.grace.result.IMOOCJSONResult;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vleus
 * @date 2023年05月15日 22:41
 */
@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private StuService stuService;

    @GetMapping("/u")
    public String hello() {

        return "Hello, user-service";
    }

    @GetMapping("/stu")
    public Object stu() {
        Stu stu = new Stu();

//        stu.setId("1001");
        stu.setAge(25);
        stu.setName("敏敏子");

        stuService.saveStu(stu);

        return "ok";
    }
}