package com.snippet.designPattern.singleton;

/**
 * 线程不安全的单例模式——懒汉式。
 */
public class Singleton02
{
    private static Singleton02 instance = null;

    private Singleton02()
    {
    }

    public static Singleton02 getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton02();
        }
        return instance;
    }

    public void say()
    {
        System.out.println("fuck it, i am 002");
    }
}
