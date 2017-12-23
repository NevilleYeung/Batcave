package com.snippet.algorithm.sort;

public class QuickSortTest
{
    public static void main(String[] args)
    {
        QuickSort qs = new QuickSort();
        int a [] = {4,32,68,1,0,4,10,2,8};
        qs.sort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i ++)
        {
            System.out.println("i = " + a[i]);
        }
    }
}
