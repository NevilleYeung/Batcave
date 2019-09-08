package com.snippet.designPattern.factory;

/**
 * 简单工厂模式
 *
 * 创建型
 */
public class SimpleChickenFactory
{

    public static IChicken createChickens(Chickens type)
    {
        switch (type)
        {
            // 还可以用反射来实例化类
            // 如：result = (FriedChicken) Class.forName(clz.getName()).newInstance();
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
