package com.atguigu.spring6.iocxml.ditest;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

//部门类
public class Dept {

    //一个部门有很多员工
    private List<Emp> empList;

    private String dname;

    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info() {
        System.out.println("部门名称："+dname);
        if(empList==null || empList.size()==0){
            System.out.println("部门没有员工");
            return;
        }
        for (Emp emp:empList) {
            System.out.println(emp.getEname());
        }
    }
}
