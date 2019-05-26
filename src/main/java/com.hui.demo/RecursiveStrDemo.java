package com.hui.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 用递归的方式打印出字符窜中最长的数字字符串，(可能有多个一样长的不同内容的字符串)
 */
public class RecursiveStrDemo {

    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        List<String> list = new ArrayList<>();
        int i = 0;
        String str = "shdg123%^sdasj1234YHhhhs1234567890dsf1234567890ssdfd0987654321";
        duiguiStr(str, i, sb, list);
        for (String sbStr : list){
            System.out.println(sbStr);
        }
    }

    /**
     * 递归将字符串中的连续数字字符串截取出来
     * @param str
     * @param i
     * @param sb
     * @param list
     */
    private static void duiguiStr(String str, int i, StringBuffer sb, List<String> list) {
        if (i < str.length()){
            char c = str.charAt(i);
            //字符'0' - '9' 在ASCII中对应的值是48 - 57
            if (c >= 48 && c <= 57){
                sb.append(c);
            }else {
                handleStringData(sb, list);
            }
            i++;
            duiguiStr(str, i, sb, list);
        }else {
            handleStringData(sb, list);
        }
    }

    /**
     * 处理截出来的字符串
     * @param sb
     * @param list
     */
    private static void handleStringData(StringBuffer sb, List<String> list) {
        if (StringUtils.isNotBlank(sb)){
            if (list.isEmpty()){
                list.add(sb.toString());
                sb.setLength(0); //初始化Stringbuffer字符串，此方法效率最高
            } else if (list.get(0).length() < sb.length()){
                list.clear();
                list.add(sb.toString());
                //sb = null; 这样设置为null,那么下一个在调用sb.append()会报空指针异常错误
                //sb = new StringBuffer();
                sb.setLength(0);
            } else if(list.get(0).length() == sb.length() && !list.get(0).equals(sb.toString())){
                list.add(sb.toString());
                sb.setLength(0);
            }else {
                sb.setLength(0);
            }
        }
    }
}
