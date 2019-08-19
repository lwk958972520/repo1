package com.itheima.dao;

import com.itheima.domain.Emp;

import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/8/11/011
 */
public interface EmpMapper {

    /**
     * 查询所有员工信息
     * @return
     */
    public List<Emp> findAll() ;
}
