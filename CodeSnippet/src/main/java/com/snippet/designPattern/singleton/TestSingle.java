package com.snippet.designPattern.singleton;

/**
 * 其实还有其它的实现方式
 */
public class TestSingle
{

    public static void main(String[] args)
    {
        Singleton01.getInstance().say();
        Singleton02.getInstance().say();
        Singleton03.getInstance().say();
        Singleton04.getInstance().say();
        Singleton05.instance.say();
    }
}
