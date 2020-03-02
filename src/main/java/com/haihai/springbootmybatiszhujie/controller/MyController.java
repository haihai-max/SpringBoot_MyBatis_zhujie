package com.haihai.springbootmybatiszhujie.controller;

import com.haihai.springbootmybatiszhujie.bean.Emp;
import com.haihai.springbootmybatiszhujie.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    EmpMapper empMapper;

    @RequestMapping("/select/{eid}")
    public Emp getEmp(@PathVariable("eid") int eid){
        return empMapper.getEmpById(eid);
    }

    @RequestMapping("/delete/{eid}")
    public int deleteEmpById(@PathVariable("eid") int eid){
        return empMapper.deleteEmpById(eid);

    }

    @RequestMapping("/insert")
    public int inertEmp(){
        Emp emp=new Emp(155,"enen");
        return empMapper.inertEmp(emp);
    }

    @RequestMapping("/update")
    public int updateEmp(){
        Emp emp=new Emp(2,"第二个");
        return empMapper.updateEmp(emp);
    }
}
