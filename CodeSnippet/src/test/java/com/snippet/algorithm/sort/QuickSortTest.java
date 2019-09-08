package com.snippet.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class QuickSortTest
{
    private QuickSort quickSort = new QuickSort();

    @Test
    public void nullCase() throws Exception
    {
        int a [] = null;
        quickSort.sort(a, 0,  1);

        assertNull(a);
    }

    @Test
    public void sort01() throws Exception
    {
        int a [] = {1};
        quickSort.sort(a, 0,  a.length - 1);

        int[] result = {1};

        assertArrayEquals(a, result);
    }

    @org.junit.Test
    public void sort02() throws Exception
    {
        int a [] = {4, 32, 68, 1, 0, 4, 10, 2, 8};
        quickSort.sort(a, 0, a.length - 1);

        int[] result = {0, 1, 2, 4, 4, 8, 10, 32, 68};

        assertArrayEquals(a, result);
    }

    @org.junit.Test
    public void sort03() throws Exception
    {
        int a [] = {9, -6, 4, 22, 10, 99};
        quickSort.sort(a, 0, a.length - 1);

        int[] result = {-6, 4, 9, 10, 22, 99};

        assertArrayEquals(a, result);
    }

    @org.junit.Test
    public void sort04() throws Exception
    {
        int a [] = {0, 0, 0, 0, 0};
        quickSort.sort(a, 0, a.length - 1);

        int[] result = {0, 0, 0, 0, 0};

        assertArrayEquals(a, result);
    }

}