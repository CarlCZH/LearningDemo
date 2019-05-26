package com.hui.demo.strategyFactorySingle;

/**
 * @Author: CarlChen
 * @Despriction:TODO
 * @Date: Create in 21:59 2019\3\19 0019
 */
public class HouseIncoming implements ItargetIncoming {
    @Override
    public String incomingMethod(String incomingField) {
        System.out.println("HouseIncoming = [" + incomingField + "]");
        return incomingField;
    }
}
