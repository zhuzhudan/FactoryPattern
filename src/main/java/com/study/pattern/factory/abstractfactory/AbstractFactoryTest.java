package com.study.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IngredientsFactory ingredientsFactory = new ChineseIngredientsFactory();
        ingredientsFactory.createBeef().getName();
        ingredientsFactory.createChicken().getName();

        ingredientsFactory = new AmericanIngredientsFactory();
        ingredientsFactory.createChicken().getName();
    }
}
