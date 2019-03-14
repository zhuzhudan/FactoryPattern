package com.study.pattern.factory.simplefactory;

import com.study.pattern.factory.IBurger;

public class ChickenBurger implements IBurger {

    public void getName() {
        System.out.println("鸡肉汉堡");
    }
}
