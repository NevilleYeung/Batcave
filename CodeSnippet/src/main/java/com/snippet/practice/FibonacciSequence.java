package com.snippet.practice;

/**
 * 要求输入一个整数n，请你输出斐波那契数列的第n项，n<=39。
 */
public class FibonacciSequence
{

    public int print(int n)
    {
        if (n < 0)
        {
            return 0;
        }
        else if (n < 2)
        {
            return n;
        }

        return print(n - 1) + print(n - 2);
    }
}
