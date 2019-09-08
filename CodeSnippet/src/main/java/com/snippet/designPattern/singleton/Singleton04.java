package com.snippet.designPattern.singleton;

/**
 * 线程安全的单例模式——懒汉式
 * 双重检查锁定，性能不会成为瓶颈。
 */
public class Singleton04
{
    private static Singleton04 instance = null;

    private Singleton04()
    {
    }

    public static Singleton04 getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton04.class)
            {
                if (instance == null)
                {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }

    public void say()
    {
        System.out.println("fuck it, i am 004");
    }
}
