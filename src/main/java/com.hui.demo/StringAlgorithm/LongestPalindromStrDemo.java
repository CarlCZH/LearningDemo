package com.hui.demo.StringAlgorithm;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: CarlChen
 * @Despriction: 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的回文串。
 * 在构造过程中，请注意区分大小写。比如"Aa"不能当做一个回文字符串。注意:假设字符串的长度不会超过 1010
 * @Date: Create in 14:45 2019\4\3 0003
 */
public class LongestPalindromStrDemo {
    public static void main(String[] args){
        String str = "abcabasdddfccabccbasdds";
        List<String> palindromList = getPalindromList(str);
        for (String string : palindromList){
            System.out.println("palindromString = " + string);
        }
    }

    /**
     * 初步对首位字符进行判断；如果返回true，将回文串截取放入list中
     * @param str
     * @return
     */
    private static List<String> getPalindromList(String str) {
        if (StringUtils.isEmpty(str)){
            return null;
        }
        //用于保存回文串
        List<String> list = new ArrayList<>();
        // 这个循环从前往后遍历元素
        for (int i = 0; i < str.length()-1; i++){
            char a = str.charAt(i);
            // 这个循环从后往前遍历元素,每次都是要从最后开始，所以要将j的初始化值提出
            int j = str.length() - 1;
            for (; j > i; j--){
                char b = str.charAt(j);
                if (a == b){
                    //如果是true，代表是回文串，将回文串截取放入list中
                    if (getPalindrom(i, j, str)){
                        list.add(str.substring(i, j + 1));
                    } else {
                        break;
                    }
                }
            }
        }
        return list;
    }

    /**
     * 对首尾相同的字符串进行截取判断，是否是回文串
     * @param startNum 截取第一位
     * @param endNum 截取最后一位 需要加上1
     * @param str 原本字符串
     */
    private static boolean getPalindrom(int startNum, int endNum, String str){
        String strNew = str.substring(startNum, endNum+1);
        //回文串至少是三位的 如：aba  bb这种类型不是
        if (strNew.length() <= 2){
            return false;
        }
        int i = 1;
        int j = strNew.length() - 2;
        while (true){
            // 当第一个下标比第二个下标大或者相等时，表示循环结束，返回true
            if (i >= j){
                return true;
            }
            //使用char类型进行对比，可以区分大小写
            if (strNew.charAt(i) != strNew.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;
        }
    }
}
