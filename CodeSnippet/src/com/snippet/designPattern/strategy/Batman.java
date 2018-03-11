package com.snippet.designPattern.strategy;

/**
 * 策略模式
 *
 */
public class Batman
{

    public static void main(String[] args)
    {
        // how batman hunts catwoman
        Strategy meetStrategy = new MeetStrategy();
        HuntContext mHuntContext = new HuntContext(meetStrategy);
        mHuntContext.doStrategy();

        Strategy makeHappyStrategy = new MakeHappyStrategy();
        HuntContext mkhHuntContext = new HuntContext(makeHappyStrategy);
        mkhHuntContext.doStrategy();

        Strategy igStrategy = new ImpresiveGiftStrategy();
        HuntContext igHuntContext = new HuntContext(igStrategy);
        igHuntContext.doStrategy();

        Strategy fuckStrategy = new FuckStrategy();
        HuntContext fHuntContext = new HuntContext(fuckStrategy);
        fHuntContext.doStrategy();

        System.out.println("\njust a joke...");
    }
}
