package com.example.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * @description: SysTask
 * @author: leiming5
 * @date: 2020-11-11 15:21
 */
@Data
public class SysTask {

    /**
     * 任务类型
     */
    private Integer type;
    /**
     * 任务数据id
     */
    private Long id;
    /**
     * 任务关键信息
     */
    private String word;

    /**
     * 任务具体描述
     */
    private String ext;

    /**
     * 任务分配人
     */
    private Integer assigner;
    /**
     * 任务被分配人
     */
    private Integer assignee;

    /**
     * 任务分配时间
     */
    private Date assignTime;

}
