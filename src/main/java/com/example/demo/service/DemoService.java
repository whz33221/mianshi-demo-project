package com.example.demo.service;

import com.example.demo.dao.entity.Demo;
import com.example.demo.dao.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;


    public void insert(Demo demo) {
        demoRepository.save(demo);
    }
}
