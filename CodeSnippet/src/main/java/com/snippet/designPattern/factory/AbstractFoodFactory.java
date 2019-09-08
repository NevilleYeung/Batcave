package com.snippet.designPattern.factory;

/**
 * 抽象工厂类
 *
 */
public abstract class AbstractFoodFactory
{
    public abstract IChicken createChickens(Chickens type);

    public abstract IDrinks createDrinks(int type);
}
