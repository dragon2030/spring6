package com.atguigu.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

    //方式一：进阶 通过spring的方式创建 德鲁伊数据源。属性通过'引入外部属性文件'完成注入
    //好处在于 解耦 可以单独修改如数据库密码地址等信息
    @Test
    public void demo2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }

    //方式一：基础：通过new对象的方式创建 德鲁伊数据源。属性通过set方式设置
    @Test
    public void demo1() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }
}
