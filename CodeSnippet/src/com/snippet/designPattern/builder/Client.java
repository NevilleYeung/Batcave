package com.snippet.designPattern.builder;

/**
 * 建造者模式的消费者类
 * 创建型
 *
 */
public class Client
{

    public static void main(String[] args)
    {
        Director director = new Director();

        // 生产10台benz
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + "=========");
            director.getABenzModel().run();
        }

        // 生产3台pagani
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i + "=========");
            director.getAPaganiModel().run();
        }
    }
}
