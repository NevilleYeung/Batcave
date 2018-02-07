package com.snippet.designPattern.singleton;

/**
 * 通过枚举实现单例。
 * 《Effective Java》：这是实现单例最好的方式。
 */
public enum Singleton05
{
    instance;

    public void say()
    {
        System.out.println("fuck it, i am 005");
    }
}
