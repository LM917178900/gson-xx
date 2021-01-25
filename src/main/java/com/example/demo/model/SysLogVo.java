package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @description: SysLogVo
 * @author: leiming5
 * @date: 2021-01-22 16:46
 */
@Setter
@Getter
public class SysLogVo {

    private Long id;

    private String level1Menu;

    private String level2Menu;

    private String level3Menu;


    private String api;

    private String visitor;

    private String message;

    private Date gmtCreate;

    private Integer status = 1;

    /**
     * 当前处理对象的json格式，
     */
    private Object logData;
}
