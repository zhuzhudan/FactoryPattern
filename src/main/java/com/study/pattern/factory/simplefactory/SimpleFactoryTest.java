package com.study.pattern.factory.simplefactory;

import com.study.pattern.factory.IBurger;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        IBurger burger = factory.createBurger("chicken");
        burger.getName();

    }
}
