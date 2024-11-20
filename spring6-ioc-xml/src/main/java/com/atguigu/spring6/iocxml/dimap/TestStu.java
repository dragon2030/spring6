package com.atguigu.spring6.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {

    @Test
    public void testStu() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
        //学生编号： 2000学生名称：张三
        //{10010=Teacher{teacherId='100', teacherName='西门讲师'}, 10086=Teacher{teacherId='200', teacherName='上官讲师'}}
        //null
    }
    @Test
    public void testStu2() {
        //p命名空间注入
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
        //学生编号： 100学生名称：mary
        //{10010=Teacher{teacherId='100', teacherName='西门讲师'}, 10086=Teacher{teacherId='200', teacherName='欧阳讲师'}}
        //[Lesson{lessonName='java开发'}, Lesson{lessonName='前端开发'}]

    }
    
    
}
