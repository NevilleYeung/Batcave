package com.snippet.designPattern.factory;

/**
 * 简单工厂模式
 *
 * 创建型
 */
public class SimpleChickenFactory
{

    // sliced cold chicken
    public static final int TYPE_SC = 1;
    // fried chicken
    public static final int TYPE_FD = 2;
    // shredded Chicken
    public static final int TYPE_SH = 3;

    public static IChicken createNoodles(int type)
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
}
