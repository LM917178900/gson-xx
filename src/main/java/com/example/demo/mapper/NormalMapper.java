package com.example.demo.mapper;

import com.example.demo.model.SysTask;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NormalMapper {

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    List<SysTask> getById(@Param("id") Long id);

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    List<Map<String, Object>> getByMap(@Param("id") Long id);

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    List<SysTask> getMyTask(@Param("id") Long id);
}
