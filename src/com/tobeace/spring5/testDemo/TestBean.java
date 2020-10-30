package com.tobeace.spring5.testDemo;

import com.tobeace.spring5.bean.Employee;
import com.tobeace.spring5.collectiontype.Student;
import com.tobeace.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 注入外部 bean 的情况
 * **/
public class TestBean {
    @Test
    public void  testBean1(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        //2、获取配置创建的对象
        UserService userService= context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void  testBean2(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
        //2、获取配置创建的对象
        Employee employee= context.getBean("employee", Employee.class);
        employee.testAdd();
    }
    @Test
    public void  testBean3(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        //2、获取配置创建的对象
        Employee employee= context.getBean("emp", Employee.class);
        employee.testAdd();
    }
    @Test
    public void  testBean4(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");
        //2、获取配置创建的对象
        Student student= context.getBean("stu", Student.class);
        student.testStudent();
    }
    @Test
    public void  testBean5(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");
        //2、获取配置创建的对象
        Student student= context.getBean("stu", Student.class);
        System.out.println(student.toString());
    }

}
