package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.SysTask;
import org.springframework.stereotype.Repository;

@Repository
public interface PlusMapper extends BaseMapper<SysTask> {


    SysTask getByTest();
}
