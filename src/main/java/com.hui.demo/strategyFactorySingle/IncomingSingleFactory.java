package com.hui.demo.strategyFactorySingle;

import java.util.HashMap;

/**
 * @Author: CarlChen
 * @Despriction: 策略+单例+工厂模式好处：设计模式易于维护，扩展性好，充分符合开闭原则
 * @Date: Create in 22:04 2019\3\19 0019
 */
public class IncomingSingleFactory {

    private static IncomingSingleFactory incomingSingleFactory = null;

    private IncomingSingleFactory() {}

    private static HashMap<String, ItargetIncoming> stargetHashMap = new HashMap<>();
    static{
        stargetHashMap.put(ElementConstant.CAR_INCOMING, new CarIncoming());
        stargetHashMap.put(ElementConstant.HOUSE_INCOMING, new HouseIncoming());
        stargetHashMap.put(ElementConstant.MONEY_INCOMING, new MoneyIncoming());
        stargetHashMap.put(ElementConstant.PRODUCT_INCOMING, new ProductIncoming());
    }

    public static IncomingSingleFactory getInstance(){
        if (incomingSingleFactory == null){
            synchronized (IncomingSingleFactory.class){
                incomingSingleFactory = new IncomingSingleFactory();
            }
        }
        return incomingSingleFactory;
    }

    public ItargetIncoming incomingTest(String incomingWay){
        return stargetHashMap.get(incomingWay);
    }

}
