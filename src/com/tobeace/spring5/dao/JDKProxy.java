package com.tobeace.spring5.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    //创建代理对象代码
    static class UserDaoProxy implements InvocationHandler{
        //1 把创建的是谁的代理对象，把谁传递过来
        //有参数构造传递
        private Object obj;

        public UserDaoProxy(Object obj) {
            this.obj = obj;
        }
        //方法之前
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("方法执行之前"+method.getName()+"传递的参数"+ Arrays.toString(args));
            //被增强的方法执行
            Object res=method.invoke(obj,args);
            //方法之后
            System.out.println("方法执行之后"+obj);
            return res;
        }
    }
    public static void main(String[] args) {
        Class[] interfaces={UserProxyDao.class};
        UserProxyDaoImpl userProxyDao=new UserProxyDaoImpl();
        UserProxyDao dao=(UserProxyDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userProxyDao));
        int result = dao.add(1,2);
        System.out.println(result);
    }
}
