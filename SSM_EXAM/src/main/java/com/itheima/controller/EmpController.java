package com.itheima.controller;

import com.itheima.domain.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/8/11/011
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService ;

    @RequestMapping(path = "/findAll")
    //@ResponseBody
    public String  findAll(Model model){
        List<Emp> emps = empService.findAll();
        model.addAttribute("emps",emps);
        return "emps" ;
    }
}
