package com.tobeace.spring5;

public class Order {
    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void testOrder(){
        System.out.println(name+" "+address);
    }
}
