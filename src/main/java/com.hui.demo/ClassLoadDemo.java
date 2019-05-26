package com.hui.demo;

public class ClassLoadDemo {

    //private static ClassLoadDemo classLoadDemo = getInstance();
    private static int x = 0;
    private static int y;
    private static ClassLoadDemo classLoadDemo = getInstance();

    private ClassLoadDemo(){
        x++;
        y++;
    }

    public static ClassLoadDemo getInstance(){
        if (classLoadDemo == null){
            classLoadDemo = new ClassLoadDemo();
        }
        return classLoadDemo;
    }

    public static void main(String[] args){
        ClassLoadDemo instance = ClassLoadDemo.getInstance();
        System.out.println(x);
        System.out.println(y);
    }
}
