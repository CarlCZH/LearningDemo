package com.hui.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 读取文件内容，将其重复出现的字符保留，组成一个新的字符串
 * "abcaFbcccc123123#$$" ----->  "abcabcccc123123$$"
 */
public class ReadFileExtractStr {

    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Map<Character, Object> recordMap = new HashMap<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:\\Users\\zche66\\Desktop\\20190128.txt")));
        String str;
        while((str = bufferedReader.readLine()) != null){
            stringBuffer.append(str);
        }

        String strNew = stringBuffer.toString();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strNew.length(); i++){
            char a = strNew.charAt(i);
            int num = 1;
            //判断Map中是否存在该值，不存在则统计出现的次数，存在则直接加入Stringbuffer中
            if(!recordMap.containsKey(a)){
                for (int j = i+1; j < strNew.length(); j++){
                    if (a == strNew.charAt(j)){
                        num++;
                    }
                }
                if (num > 1){
                    sb.append(a);
                    //说明是第一次遍历出来，将字符以及对应出现的次数放入Map中
                    recordMap.put(a, num);
                }
            }else {
                sb.append(a);
            }
        }

        System.out.println(stringBuffer.toString());
        System.out.println(sb.toString());

        Set<Map.Entry<Character, Object>> entries = recordMap.entrySet();
        for (Map.Entry<Character, Object> entry : entries){
            System.out.println(entry.getKey() + "......." + entry.getValue());
        }
    }
}
