package com.snippet.designPattern.factory;

/**
 * 工厂模式：多种类的创建
 * TODO: 把chicken和drink分开建立工厂，可以修改为抽象工厂
 *
 * 创建型
 */
public class ShaxianCountySnacksFactory extends AbstractFoodFactory
{

    @Override
    public IChicken createChickens(Chickens type)
    {
        switch (type)
        {
            case TYPE_SC:
                return new SlicedColdChicken();
            case TYPE_FD:
                return new FriedChicken();
            case TYPE_SH:
            default:
                return new ShreddedChicken();
        }

    }

    @Override
    public IDrinks createDrinks(int type)
    {
        return new ColaDrinks();
    }
}
