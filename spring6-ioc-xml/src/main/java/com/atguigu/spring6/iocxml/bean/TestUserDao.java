package com.atguigu.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    /*用与验证
      1、如果组件类实现了接口，根据接口类型可以获取 bean 吗？
         可以，前提是bean唯一
      2、如果一个接口有多个实现类，这些实现类都配置了 bean，根据接口类型可以获取 bean 吗？
          不行，因为bean不唯一
     */
    
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        //根据类型获取接口对应bean
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
        //当配置多个接口类的实现时，按照接口type获取bean时会报错
        //Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: 
        // No qualifying bean of type 'com.atguigu.spring6.iocxml.bean.UserDao' available: 
        // expected single matching bean but found 2: 
        // userDaoImpl,personDaoImpl

    }
}
