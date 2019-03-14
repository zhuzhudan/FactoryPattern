package com.study.pattern.factory.simplefactory;

import com.study.pattern.factory.IBurger;

public class SimpleBurgerFactory {
    public IBurger createBurger(String type){
        IBurger burger = null;

        if("chicken".equals(type)){
            burger = new ChickenBurger();
        }else if("beef".equals(type)){
            burger = new BeefBurger();
        }

        return burger;
    }
}
