package com.hui.demo;

public class TestFour {

    public static class A{
        public void port(){
            System.out.println("1");
        }

        public A(){
            System.out.println("A");
        }

        static {
            System.out.println("A1");
        }


    }

    public static class B extends A{
        public void port(){
            System.out.println("p");
        }

        public B(){
            System.out.println("B");
        }

        static {
            System.out.println("B1");
        }

    }

    public static void main(String[] args){
        A a = new B();
        a = new A();
    }

}
