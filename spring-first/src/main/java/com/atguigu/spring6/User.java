package com.atguigu.spring6;

public class User {

    private String name;

    private Person person;

    //无参数构造 用于测试spring通过反射调用了bean的无参构造器
    public User() {
        System.out.println("0: 无参数构造执行了..");
    }

    public void add() {
        System.out.println("add.....");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
