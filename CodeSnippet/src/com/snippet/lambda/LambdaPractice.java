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
        //

    }

    public void say(Hello h)
    {
        h.sayYeah();

        h.sayName("shitty");
    }
}
