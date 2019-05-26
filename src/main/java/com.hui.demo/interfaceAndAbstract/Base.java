package com.hui.demo.interfaceAndAbstract;

/**
 * 接口与接口之间可以继承(extends),而且可以多继承
 * 抽象类可以实现接口(可以不重写里面如何方法)，但不能继承接口
 * 接口中定义的方法只能是public的，所以实现接口类里面的方法只能是public的
 */
public interface Base {
    Boolean method();
    byte method2(int num);
}

interface Base2 extends Base{
}

abstract class Base3 implements Base{
}

abstract class Base4 implements Base{
    @Override
    public Boolean method() {
        return (5 > 7);
    }
}
