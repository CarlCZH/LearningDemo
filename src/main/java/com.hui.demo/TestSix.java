package com.hui.demo;

public class TestSix {

    public static void main(String[] args){
        String a = "a";
        String b = "a";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(!(a==b) || !a.equals(b));
        System.out.println(!(!(a==b)) || !a.equals(b));

        System.out.println((12 >> 1) & 1);
    }

}
