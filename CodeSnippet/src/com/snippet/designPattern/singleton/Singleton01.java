package com.snippet.designPattern.singleton;

/**
 * 线程安全的单例模式——饿汉式。
 * 对象在类加载时完成实例化。
 *
 * P.S. 若继承了Cloneable接口，且实现clone方法，则可以直接通过对象复制方式创建新对象。
 */
public class Singleton01
{
    private static final Singleton01 instance = new Singleton01();

    private Singleton01()
    {
    }

    public static Singleton01 getInstance()
    {
        return instance;
    }

    public void say()
    {
        System.out.println("fuck it, i am 001");
    }
}
