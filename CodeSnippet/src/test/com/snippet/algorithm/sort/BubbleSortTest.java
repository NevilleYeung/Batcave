package test.com.snippet.algorithm.sort;

import com.snippet.algorithm.sort.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest
{
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort1()
    {
        int[] array = new int[]{0, 6, 7, 8, 6, -21, 45};
        bubbleSort.sort1(array);
        System.out.println(Arrays.toString(array));
        Assert.assertArrayEquals(new int[]{-21, 0, 6, 6, 7, 8, 45}, array);
    }

    @Test
    public void testSort2()
    {
        int[] array = new int[]{-2, 8, 6, 7, 8, 100, 45, 33};
        bubbleSort.sort2(array);
        System.out.println(Arrays.toString(array));
        Assert.assertArrayEquals(new int[]{-2, 6, 7, 8, 8, 33, 45, 100}, array);
    }

    @Test
    public void testSort3()
    {
        int[] array = new int[]{0, 8, 7, 7, 6, -21, 12, -1};
        bubbleSort.sort3(array);
        System.out.println(Arrays.toString(array));
        Assert.assertArrayEquals(new int[]{-21, -1, 0, 6, 7, 7, 8, 12}, array);
    }

    @Test
    public void testCocktailSort1()
    {
        int[] array = new int[]{0, 8, 7, 7, 6, -21, 12, -1};
        bubbleSort.cocktailSort1(array);
        System.out.println(Arrays.toString(array));
        Assert.assertArrayEquals(new int[]{-21, -1, 0, 6, 7, 7, 8, 12}, array);
    }

    @Test
    public void testCocktailSort2()
    {
        int[] array = new int[]{0, 8, 7, 7, 6, -21, 12, -1};
        bubbleSort.cocktailSort2(array);
        System.out.println(Arrays.toString(array));
        Assert.assertArrayEquals(new int[]{-21, -1, 0, 6, 7, 7, 8, 12}, array);
    }
}