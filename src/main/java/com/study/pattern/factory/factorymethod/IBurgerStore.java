package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public interface IBurgerStore {
    IBurger createBurger(String type);
}
