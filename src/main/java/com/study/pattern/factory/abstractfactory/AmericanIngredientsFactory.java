package com.study.pattern.factory.abstractfactory;

public class AmericanIngredientsFactory implements IngredientsFactory {
    public IBeef createBeef() {
        return new AmericanBeef();
    }

    public IChicken createChicken() {
        return new AmericanChicken();
    }
}
