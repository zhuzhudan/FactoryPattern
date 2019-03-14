package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public class ChineseBurgerStore implements IBurgerStore {
    public IBurger createBurger(String type) {
        IBurger burger = null;
        if("chicken".equals(type)){
            burger = new ChineseChickenBurger();
        }else if("beef".equals(type)){
            burger = new ChineseBeefBurger();
        }
        return burger;
    }
}
