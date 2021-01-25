package com.example.demo.model;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.google.gson.JsonElement;
import lombok.Data;

import java.util.Date;


/**
 * @author heqiang7
 */
@Data
@TableName("sys_log")
//@JsonIgnoreProperties({ "logData","handler","hibernateLazyInitializer" })
public class SysLog {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField("level1_menu")
    private String level1Menu;

    @TableField("level2_menu")
    private String level2Menu;

    @TableField("level3_menu")
    private String level3Menu;

//    private String category;

//    private String item;

    private String api;

    private String visitor;

    private String message;

    @TableField("gmt_create")
    private Date gmtCreate;

    private Integer status = 1;

    /**
     * 当前处理对象的json格式，
     */
    @TableField("log_data")
    private JsonElement logData;

    /**
     * 封装字符串类型
     */
    private String logDataStr;


    public void setLogData(JsonElement logData) {
        this.logData = logData;
//        this.logDataStr = JSON.toJSONString(logData);
        setGmtCreate(new Date());
    }
}
