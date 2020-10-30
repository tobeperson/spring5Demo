package com.tobeace.spring5.testDemo;

import com.tobeace.spring5.Book;
import com.tobeace.spring5.Order;
import com.tobeace.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void  testBook(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        book.testBook();
    }
    @Test
    public void  testOrder(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象
        Order order = context.getBean("order", Order.class);
        order.testOrder();
    }
    @Test
    public void  testBook1(){
        //1、加载spring 配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象
        Book book = context.getBean("book1", Book.class);
        book.testBook();
    }
}
