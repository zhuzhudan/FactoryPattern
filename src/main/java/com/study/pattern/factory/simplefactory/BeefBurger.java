package com.study.pattern.factory.simplefactory;

import com.study.pattern.factory.IBurger;

public class BeefBurger implements IBurger {
    public void getName() {
        System.out.println("牛肉汉堡");
    }
}
