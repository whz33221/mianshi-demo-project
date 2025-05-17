package com.example.demo.dao.repository;


import com.example.demo.dao.entity.Demo;
import com.example.demo.dao.entity.PDemo;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * 描述: 档案dao接口
 * @Author: 后端引擎
 * @Date: Nov 25, 2024, 4:40:48 PM
 */

public interface DemoRepository extends JpaRepository<Demo, Long>, JpaSpecificationExecutor<Demo> {
    Optional<PDemo> queryById(Long id);

}