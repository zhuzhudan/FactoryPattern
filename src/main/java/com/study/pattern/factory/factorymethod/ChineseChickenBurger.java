package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public class ChineseChickenBurger implements IBurger {
    public void getName() {
        System.out.println("中国的鸡肉汉堡");
    }
}
