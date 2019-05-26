package com.hui.demo.strategyFactorySingle;

/**
 * @Author: CarlChen
 * @Despriction:TODO
 * @Date: Create in 22:00 2019\3\19 0019
 */
public class MoneyIncoming implements ItargetIncoming {
    @Override
    public String incomingMethod(String incomingField) {
        System.out.println("MoneyIncoming = [" + incomingField + "]");
        return incomingField;
    }
}
