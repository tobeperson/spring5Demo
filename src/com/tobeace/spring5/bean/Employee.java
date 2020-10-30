package com.tobeace.spring5.bean;

public class Employee {
    private String ename;



    private String gender;

    private Department department;
    //员工属于某一个部门，使用对象形式表示
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void testAdd(){
        System.out.println(ename+" "+ gender+" "+ department.toString());
    }
}
