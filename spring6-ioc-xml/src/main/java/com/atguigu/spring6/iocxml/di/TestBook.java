package com.atguigu.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    //实验二：依赖注入之setter注入
    //基于set方法完成注入
    @Test
    public void testSetter() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        //无参数构造执行了...
        //Book{bname='前端开发', author='尚硅谷', others='a < b'}
    }

    //实验三：依赖注入之构造器注入
    //基于构造器完成注入
    @Test
    public void testConstructor() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("bookCon", Book.class);
        System.out.println(book);
        //有参数构造执行了...
        //Book{bname='java开发', author='尚硅谷', others='null'}
    }
}
