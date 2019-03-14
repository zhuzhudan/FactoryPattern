package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public class AmericanChickenBurger implements IBurger {
    public void getName() {
        System.out.println("美国的鸡肉汉堡");
    }
}
