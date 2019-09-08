package com.snippet.practice;

import org.junit.Test;

public class PokerFaceTest
{
    private PokerFace pokerFace = new PokerFace();

    @Test
    public void isContinuous() throws Exception
    {
        int numbers [] = {1, 0, 0, 5, 0};

        System.out.println(pokerFace.isContinuous(numbers));



    }

}