package com.itheima.service.impl;

import com.itheima.dao.EmpMapper;
import com.itheima.domain.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/8/11/011
 */
@Service
//@Transactional(readOnly = false , propagation = Propagation.REQUIRED)
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper ;

    @Override
    //@Transactional(readOnly = true , propagation = Propagation.SUPPORTS)
    public List<Emp> findAll() {
        return empMapper.findAll();
    }
}
