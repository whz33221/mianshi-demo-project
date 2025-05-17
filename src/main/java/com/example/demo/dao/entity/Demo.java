package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.*;

import org.springframework.data.annotation.CreatedDate;


/**
* 描述: 档案
*
* @Author: 后端引擎
*/

@Getter
@Setter
@Accessors(chain = true)
@FieldNameConstants
@DynamicInsert
@DynamicUpdate
@Entity
public class Demo{
    @Id
    @Comment(value = "主键")
    @Column(name="f_id")
    protected Long id;

    @Comment(value = "创建人")
    @Column(name="f_create_by")
    private Long createBy;

    @Comment(value = "创建时间")
    @Column(name="f_create_time")
    @CreatedDate
    private LocalDateTime createTime;
}
