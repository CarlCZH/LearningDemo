package com.hui.demo;

public class TestThree {

    private int count;

    public static void main(String[] args){

        TestThree testThree = new TestThree(999);
        System.out.println(testThree.count);
    }

    TestThree(int b){
        count = b;
    }
}
