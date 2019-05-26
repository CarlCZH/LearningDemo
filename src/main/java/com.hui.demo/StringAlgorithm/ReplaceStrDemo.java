package com.hui.demo.StringAlgorithm;

/**
 * @Author: CarlChen
 * @Despriction: 请实现一个函数，将一个字符串中的每个空格替换成“%20”
 * @Date: Create in 22:20 2019\4\2 0002
 */
public class ReplaceStrDemo {

    public static void main(String[] args){
        String initStrOne = "We are happy!";
        String initStrTwo = "We are happy!";

        //方法一：使用String的API方法
        String replaceStrOne = initStrOne.replaceAll("\\s", "%20");
        System.out.println("使用String的API方法进行替换------ "+replaceStrOne);

        //方法二：自写方式，使用字符串遍历方式
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < initStrTwo.length(); i++){
            char c = initStrTwo.charAt(i);
            if (String.valueOf(c).equals(" ")){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(c);
            }
        }
        String replaceStrTwo = stringBuffer.toString();
        System.out.println("使用自写方式，使用字符串遍历方式------ "+replaceStrTwo);

    }

}
