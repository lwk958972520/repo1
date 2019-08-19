package com.itheima.dao;

import com.itheima.domain.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author 王磊
 * @Date 2019/8/11/011
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpMapperTest {

    @Autowired
    private EmpMapper empMapper ;

    @Test
    public void findAll() {
        List<Emp> emps = empMapper.findAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}