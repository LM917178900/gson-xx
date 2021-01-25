package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.PlusMapper;
import com.example.demo.model.SysTask;
import com.example.demo.service.IPlusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @description: PlusServiceImpl
 * @author: leiming5
 * @date: 2020-12-29 14:08
 */

@Service
public class PlusServiceImpl extends ServiceImpl<PlusMapper, SysTask> implements IPlusService {

    /**
     * dao 接口
     */
    @Resource
    private PlusMapper plusMapper;

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @Override
    public List<SysTask> getByIdxx(Long id) {

        /**
         * plus方法一：从 ServiceImpl 中通过现成的service方法获取数据；
         * 优点：使用现成的方法，省去业务代码和mapper、mapper.xml的工作量；
         */
        SysTask task = getById(id);

        /**
         * plus方法二：从BaseMapper 中通过现成的dao接口获取数据；
         * 优点：使用现成的接口，省去mapper、mapper.xml的工作量；
         */
        SysTask sysTask = plusMapper.selectById(id);
        return Arrays.asList(task, sysTask);
    }
}
