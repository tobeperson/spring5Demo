package com.tobeace.spring5;
/**
 * 使用set方法进行属性注入
 * **/
public class Book {
    //创建属性
    private  String name;
    private String author;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    //创建set方法
    public void setName(String name) {
        this.name = name;
    }
    public void testBook(){
        System.out.println(name+" "+author+" "+address);
    }
}
