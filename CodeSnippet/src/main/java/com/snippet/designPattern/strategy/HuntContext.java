package com.snippet.designPattern.strategy;

/**
 * how batman hunts catwoman
 */
public class HuntContext
{
    private Strategy strategy = null;

    public HuntContext(Strategy s)
    {
        this.strategy = s;
    }

    public void doStrategy()
    {
        strategy.doSomething();
    }
}
