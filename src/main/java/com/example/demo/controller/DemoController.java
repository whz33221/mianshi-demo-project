package com.example.demo.controller;


import com.example.demo.dao.entity.Demo;
import com.example.demo.service.DemoService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;


    @GetMapping(path = "/api/service-open/demo")
    public String demo() {
        return "hello world";
    }

    @PostMapping(path = "/api/service-open/demo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@RequestBody Demo demo) {
        demoService.insert(demo);
    }
}