package com.hui.demo.strategyFactorySingle;

/**
 * @Author: CarlChen
 * @Despriction:TODO
 * @Date: Create in 21:57 2019\3\19 0019
 */
public class CarIncoming implements ItargetIncoming{
    @Override
    public String incomingMethod(String incomingField) {
        System.out.println("CarIncoming = [" + incomingField + "]");
        return incomingField;
    }
}
