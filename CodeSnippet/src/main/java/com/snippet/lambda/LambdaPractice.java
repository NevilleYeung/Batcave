package com.snippet.lambda;

public class LambdaPractice
{
    public static void main(String[] args)
    {
        // 1
        // Java 8之前：
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        //Java 8 lambda方式：
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();


        // 2
        // lambda表达式只能实现函数式接口
        Hello hello = shit -> { System.out.println("hello "+ shit);};
        say(hello);
        say((String hell) -> System.out.println("fuck " + hell));

        // 3 TODO
    }

    public static void say(Hello h)
    {
        h.sayName("shitty");
    }
}
