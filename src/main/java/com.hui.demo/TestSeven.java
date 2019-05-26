package com.hui.demo;

public class TestSeven {

    public static void main(String[] args){

        Object replaceContent = "AWS";
        int replaceStart = 1;
        int replaceEnd = 3 ;

        String strOld = "ASDWefsw03sadDJ";

        System.out.println(strOld);

        reverseDefiniate(strOld);

        replaceDefiniate(strOld, replaceContent, replaceStart, replaceEnd);

    }

    /**
     * 替换内容
     * @param strOld
     * @param replaceContent
     * @param replaceStart
     * @param replaceEnd
     */
    private static void replaceDefiniate(String strOld, Object replaceContent, int replaceStart, int replaceEnd) {
        String substring = strOld.substring(0, replaceStart-1);
        System.out.println(substring);
        String substring1 = strOld.substring(replaceEnd);
        System.out.println(substring1);
        strOld = substring + replaceContent + substring1;
        System.out.println(strOld);
    }


    /**
     * 反转
     * @param strOld
     */
    private static void reverseDefiniate(String strOld) {

        char[] chars = strOld.toCharArray();

        char[] charNew = new char[chars.length];

        int j = 0;
        for(int i = chars.length - 1; i >= 0; i--){
            charNew[j] = chars[i];
            j++;
        }

        System.out.println(charNew);
    }

}
