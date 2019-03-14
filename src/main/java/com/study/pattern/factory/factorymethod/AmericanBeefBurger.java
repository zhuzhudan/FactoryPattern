package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public class AmericanBeefBurger implements IBurger {
    public void getName() {
        System.out.println("美国的牛肉汉堡");
    }
}
