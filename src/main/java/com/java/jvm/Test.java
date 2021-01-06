package com.java.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Student");
        Method[] m=c.getDeclaredMethods();
        Field [] f= c.getDeclaredFields();
        for (Method m1:m)
            System.out.println(m1);
        for (Field f1:f)
            System.out.println(f1);
        Student s1= new Student();
        Class c1 = s1.getClass();
        System.out.println(c.hashCode());
        System.out.println(c1.hashCode());
    }
}
