package com.hui.demo.strategyFactorySingle;

/**
 * @Author: CarlChen
 * @Despriction:TODO
 * @Date: Create in 21:58 2019\3\19 0019
 */
public class ProductIncoming implements ItargetIncoming{
    @Override
    public String incomingMethod(String incomingField) {
        System.out.println("ProductIncoming = [" + incomingField + "]");
        return incomingField;
    }
}
