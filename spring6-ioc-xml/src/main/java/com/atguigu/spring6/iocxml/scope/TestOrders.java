package com.atguigu.spring6.iocxml.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        Orders orders1 = context.getBean("orders", Orders.class);
        System.out.println(orders1);
    }
    //单实例测试
    @Test
    public void Test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders1", Orders.class);
        System.out.println(orders);//com.atguigu.spring6.iocxml.scope.Orders@2692b61e
        Orders orders1 = context.getBean("orders1", Orders.class);
        System.out.println(orders1);//com.atguigu.spring6.iocxml.scope.Orders@2692b61e
        //org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@265adfad
        //（创建对象）
        //org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 1 bean definitions from class path resource [bean-scope.xml]
        //（扫码到配置文件bean-scope.xml）
        //org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'orders1'
        //（创建单实例bean orders1）
        //com.atguigu.spring6.iocxml.scope.Orders@2692b61e
        //com.atguigu.spring6.iocxml.scope.Orders@2692b61e
        //（证明是个单实例对象）
    }

    //多实例测试 记得执行一个注释另一个 可以明确看到没有日志 Creating shared instance of singleton bean 'orders1'
    @Test
    public void Test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders2", Orders.class);
        System.out.println(orders);
        Orders orders1 = context.getBean("orders2", Orders.class);
        System.out.println(orders1);
        //org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@265adfad
        //org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 1 bean definitions from class path resource [bean-scope.xml]
        //（此处没有再初始化bean，证明在容器启动时 多实例模式不会初始化bean）
        //com.atguigu.spring6.iocxml.scope.Orders@7b64240d
        //com.atguigu.spring6.iocxml.scope.Orders@62fad19
        //证明 创建了两个对象 是多实例
    }
}
