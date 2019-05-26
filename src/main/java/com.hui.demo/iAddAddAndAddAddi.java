package com.hui.demo;

/**
 * @Author: CarlChen
 * @Despriction: 1,i++与++i的区别 2,return的作用---加return返回值是，返回的值跟后续的操作无关，只返回当时的值
 */
public class iAddAddAndAddAddi {

    public static void main(String[] args){
        int plus1 = plus(5);
        int plus2 = plus2(5);
        System.out.println(plus1);   //6
        System.out.println(plus2);   //6

    }

    public static int plus(int i){
        try {
            ++i;
            return i++;
        }finally {
            i++;
        }
    }


    public static int plus2(int i){
        try{
            ++i;
        }finally {
            return i++;
        }
    }
}
