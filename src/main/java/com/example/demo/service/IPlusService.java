package com.example.demo.service;

import com.example.demo.model.SysTask;

import java.util.List;

public interface IPlusService {

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    List<SysTask> getByIdxx(Long id);
}
