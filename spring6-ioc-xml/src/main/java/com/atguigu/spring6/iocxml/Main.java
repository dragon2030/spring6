package com.atguigu.spring6.iocxml;

import com.atguigu.spring6.iocxml.bean.TestUser;
import com.atguigu.spring6.iocxml.bean.TestUserDao;
import com.atguigu.spring6.iocxml.ditest.TestEmp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: bigDragon
 * @create: 2024/10/29
 * @Description:
 */
public class Main {
    public static void main (String[] args) {
         // 实验一：获取bean————获取bean演示，user对象创建
        //实验一：获取bean————用与验证接口的实现类
        new com.atguigu.spring6.iocxml.bean.TestUser();
        new ClassPathXmlApplicationContext("bean.xml");
        new com.atguigu.spring6.iocxml.bean.TestUserDao();
    
        //实验二：依赖注入之setter注入
        //基于set方法完成注入
        //实验三：依赖注入之构造器注入
        //基于构造器完成注入
        //实验四：特殊值处理
        new com.atguigu.spring6.iocxml.di.TestBook();
        new ClassPathXmlApplicationContext("bean-di.xml");
        
        //实验五：为对象类型属性赋值 方式一：引用外部bean 方式二：内部bean 方式三：级联属性赋值
        //实验六：为数组类型属性赋值
        new com.atguigu.spring6.iocxml.ditest.TestEmp();
        //实验七：为集合类型属性赋值
        new com.atguigu.spring6.iocxml.ditest.TestDept();
        //实验七：为Map集合类型属性赋值 包含两种 其中一种是简写
        //引用集合类型的bean  xmlns:util
        //实验八：p命名空间
        new com.atguigu.spring6.iocxml.dimap.TestStu();

        //实验九：引入外部属性文件
        new com.atguigu.spring6.iocxml.jdbc.TestJdbc();
    }
}
