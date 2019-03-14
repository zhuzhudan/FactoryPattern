package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.IBurger;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IBurgerStore burgerStore = new ChineseBurgerStore();
        IBurger burger = burgerStore.createBurger("beef");
        burger.getName();

        burgerStore = new AmericanBurgerStore();
        burger = burgerStore.createBurger("chicken");
        burger.getName();
    }
}
