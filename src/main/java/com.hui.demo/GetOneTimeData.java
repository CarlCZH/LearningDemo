package com.hui.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: CarlChen
 * @Despriction:TODO
 * @Date: Create in 12:53 2019\3\14 0014
 */
public class GetOneTimeData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String[] str = input.nextLine().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int result[] = getOnceElements(arr);
            Integer[] integers = Find_Num_2(arr);
            System.out.println(Arrays.toString(result));
            System.out.println(Arrays.toString(integers));
        }
    }

    public static int[] getOnceElements(int[] arr) {
        //用于保存结果
        int[] result = new int[2];
        //1、先进行异或,得到数组中所有元素异或的结果
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res ^= arr[i];
        }
        //2、找到异或结果二进制表示中中不为0的位
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if ((res >> i & 1) == 1) {
                index = i;
                break;
            }
        }
        //3、将数组按第index位为0和为1，分为两组
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >> index & 1) == 1) {
                result[0] ^= arr[i];
            } else {
                result[1] ^= arr[i];
            }
        }
        return result;
    }

    public static Integer[] Find_Num_2(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();//创建Set集合
        for(int i : arr) {//增强for循环遍历数组
            if(!set.add(i))//添加不成功返回false，前加上！运算符变为true
                set.remove(i);//移除集合中与这个要添加的数重复的元素
        }
        if(set.size() == 0)	return null;
        //如果Set集合长度为0，返回null表示没找到
        return set.toArray(new Integer[set.size()]);
    }

}
