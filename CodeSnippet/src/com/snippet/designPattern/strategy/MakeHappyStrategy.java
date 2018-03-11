package com.snippet.designPattern.strategy;

public class MakeHappyStrategy implements Strategy
{

    @Override
    public void doSomething()
    {
        System.out.println("make her happy");
    }

}
