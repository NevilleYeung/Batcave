package com.snippet.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumberTest
{
    private UglyNumber un = new UglyNumber();

    @Test
    public void getUglyNumEfficiently() throws Exception
    {
        int num = un.getUglyNumEfficiently(10);

        assertEquals(12, num);
    }

    @Test
    public void getUglyNum() throws Exception
    {
        int num = un.getUglyNum(10);

        assertEquals(12, num);
    }

}