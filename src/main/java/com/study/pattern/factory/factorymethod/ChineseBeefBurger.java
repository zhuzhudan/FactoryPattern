package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public class ChineseBeefBurger implements IBurger {
    public void getName() {
        System.out.println("中国的牛肉汉堡");
    }
}
