package com.atguigu.spring6.iocxml.bean;

import com.atguigu.spring6.iocxml.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        //1 根据id获取bean,就是xml文件中配置bean的id属性 
        // getBean(String name)
        User user1 = (User)context.getBean("user");
        System.out.println("1 根据id获取bean: "+user1);//1 根据id获取bean: com.atguigu.spring6.iocxml.bean.User@246f8b8b

        //2 根据类型获取bean 
        // getBean(Class<T> requiredType)
        User user2 = context.getBean(User.class);
        System.out.println("2 根据类型获取bean: "+user2);//2 根据类型获取bean: com.atguigu.spring6.iocxml.bean.User@246f8b8b
        //当配置多个User类的bean时会报错
        //Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        // No qualifying bean of type 'com.atguigu.spring6.iocxml.bean.User' available: 
        //  expected single matching bean but found 2: user,user1
        
        //3 根据id和类型获取bean
        // getBean(String name, Class<T> requiredType
        User user3 = context.getBean("user", User.class);
        System.out.println("3 根据id和类型获取bean: "+user3);//3 根据id和类型获取bean: com.atguigu.spring6.iocxml.bean.User@246f8b8b
    }
}
