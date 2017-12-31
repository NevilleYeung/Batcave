package test.com.snippet.algorithm.sort;

import com.snippet.algorithm.sort.QuickSort;
import org.junit.Test;

import static org.junit.Assert.*;

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
        int a [] = {0, 0, 0, 0, 0};
        quickSort.sort(a, 0, a.length - 1);

        int[] result = {0, 0, 0, 0, 0};

        assertArrayEquals(a, result);
    }

}