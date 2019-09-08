package com.snippet.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest
{

    FibonacciSequence fs = new FibonacciSequence();

    @Test
    public void exceptionCase01() throws Exception
    {
        assertEquals(0, fs.print(0));
    }

    @Test
    public void exceptionCase02() throws Exception
    {
        assertEquals(0, fs.print(-1));
    }

    @Test
    public void exceptionCase03() throws Exception
    {
        assertEquals(0, fs.print(-43));
    }

    @Test
    public void normalTest01() throws Exception
    {
        assertEquals(1, fs.print(1));
    }

    @Test
    public void normalTest02() throws Exception
    {
        assertEquals(1, fs.print(2));
    }

    @Test
    public void normalTest03() throws Exception
    {
        assertEquals(2, fs.print(3));
    }

    @Test
    public void normalTest04() throws Exception
    {
        assertEquals(34, fs.print(9));
    }

    @Test
    public void normalTest05() throws Exception
    {
        assertEquals(63245986, fs.print(39));
    }
}