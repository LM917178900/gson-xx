package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.SysLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {

    /**
     * 新增
     *
     * @param records
     * @return
     */
    int batchInsert(List<SysLog> records);

    /**
     * 删除
     *
     * @param id
     * @return 操作行数
     * @author leiming5
     */
    int deleteById(@Param("id") Long id);

    /**
     * 单个修改
     *
     * @param sysLog
     * @return 操作行数
     * @author leiming5
     */
    int editById(@Param("bean") SysLog sysLog);
    /**
     * 当个查询；
     *
     * @param id
     * @return 查询结果
     * @author leiming5
     */
    SysLog getById(@Param("id") Long id);
}
