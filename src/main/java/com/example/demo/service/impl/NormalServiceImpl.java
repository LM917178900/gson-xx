package com.example.demo.service.impl;

import com.example.demo.mapper.NormalMapper;
import com.example.demo.model.SysTask;
import com.example.demo.service.INormalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @description: NormalServiceImpl
 * @author: leiming5
 * @date: 2020-12-29 09:13
 */
@Service
public class NormalServiceImpl implements INormalService {

    /**
     * dao 接口
     */
    @Resource
    private NormalMapper normalMapper;
    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @Override
    public List<SysTask> getById(Long id){
        return normalMapper.getMyTask(id);
    }

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @Override
    public List<Map<String, Object>> getByMap(Long id){
        return normalMapper.getByMap(id);
    }
}
