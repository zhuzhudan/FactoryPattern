package com.study.pattern.factory.abstractfactory;

public class ChineseIngredientsFactory implements IngredientsFactory {
    public IBeef createBeef() {
        return new ChineseBeef();
    }

    public IChicken createChicken() {
        return new ChineseChicken();
    }
}
