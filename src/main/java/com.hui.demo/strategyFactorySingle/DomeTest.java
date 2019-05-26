package com.hui.demo.strategyFactorySingle;

/**
 * @Author: CarlChen
 * @Despriction:TODO
 * @Date: Create in 22:15 2019\3\19 0019
 */
public class DomeTest {

    public static void main(String[] args){

        String param = "product";
        String param2 = "house";

        IncomingSingleFactory isf = IncomingSingleFactory.getInstance();

        ItargetIncoming itargetIncoming = isf.incomingTest(param);
        System.out.println(itargetIncoming.incomingMethod(param));

        ItargetIncoming itargetIncoming2 = isf.incomingTest(param2);
        System.out.println(itargetIncoming2.incomingMethod(param2));

    }

}
