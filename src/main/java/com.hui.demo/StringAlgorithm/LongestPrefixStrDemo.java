package com.hui.demo.StringAlgorithm;


import java.util.Arrays;

/**
 * @Author: CarlChen
 * @Despriction: 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串" "
 *  思路:先利用Arrays.sort(strs)为数组排序，再将数组第一个元素和最后一个元素的字符从前往后对比即可！
 * @Date: Create in 22:32 2019\4\2 0002
 */
public class LongestPrefixStrDemo {

    public static void main(String[] args){
        String[] strArrayOne = {"flower","falow","flight"};
        String[] strArrayTwo = {"dog","racecar","car"};

        String prefixInStrs = findPrefixInStrs(strArrayTwo);
        System.out.println("prefixInStrs = " + prefixInStrs);

    }

    private static String findPrefixInStrs(String[] strArray) {
        Boolean flag = checkStrs(strArray);

        // 如果检查值不合法及就返回空串
        if (!flag){
            return " ";
        }
        int len = strArray.length;
        StringBuffer res = new StringBuffer();
        // 给字符串数组的元素按照升序排序(包含数字的话，数字会排在前面)
        // 排序后，只需要对第一个与最后一个进行判断就行
        Arrays.sort(strArray);
        int m = strArray[0].length();
        int n= strArray[len - 1].length();
        int num = Math.min(m, n);
        for (int i=0; i<num; i++){
            if (strArray[0].charAt(i) == strArray[len - 1].charAt(i)){
                res.append(strArray[0].charAt(i));
            }else {
                break;
            }
        }
        return res.toString();
    }

    /**
     * 遍历数组中的每个字符串，一旦里面有一个字符串为空的话；就表示该数组中没有最长公共前缀
     * @param strArray
     * @return
     */
    private static Boolean checkStrs(String[] strArray) {
        Boolean flag = false;
        if (strArray != null){
            //遍历
            for (int i = 0; i < strArray.length; i++){
                if (strArray[i] != null && strArray[i].length() != 0){
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}
