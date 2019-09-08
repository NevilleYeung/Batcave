package com.snippet.designPattern.singleton;

/**
 * 线程安全的单例模式——懒汉式，但可能会成为性能瓶颈。
 *
 */
public class Singleton03
{
    private static Singleton03 instance = null;

    private Singleton03()
    {
    }

    public synchronized static Singleton03 getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton03();
        }
        return instance;
    }

    public void say()
    {
        System.out.println("fuck it, i am 003");
    }
}
