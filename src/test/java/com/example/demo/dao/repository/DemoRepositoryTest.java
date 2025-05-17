package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Demo;
import com.example.demo.dao.entity.PDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DemoRepositoryTest {

    @Autowired
    private DemoRepository demoRepository;

    @Test
    public void test(){
        Optional<PDemo> byId = demoRepository.queryById(1L);
        System.out.println(byId);
    }

}