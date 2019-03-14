package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public class AmericanBurgerStore implements IBurgerStore {
    public IBurger createBurger(String type) {
        IBurger burger = null;
        if("chicken".equals(type)){
            burger = new AmericanChickenBurger();
        } else if("beef".equals(type)){
            burger = new AmericanBeefBurger();
        }
        return  burger;
    }
}
