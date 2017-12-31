package com.snippet.algorithm.sort;

public class QuickSort
{
    public void sort(int [] array)
    {
        if (array != null && array.length > 1)
        {
            sort(array, 0, array.length - 1);
        }
    }

    public void sort(int [] array, int low, int high)
    {
        if (array == null || array.length == 1)
        {
            return;
        }
        if ( low >= high)
        {
            return;
        }

        int key = array[low];
        int i = low;
        int j = high;
        int tmp = 0;

        while (i != j)
        {
            for (; j > i; j--)
            {
                if (array[j] <= key)
                {
                    break;
                }
            }

            for (; i < j; i++)
            {
                if (array[i] > key)
                {
                    break;
                }
            }

            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }

        tmp = array[j];
        array[j] = array[low];
        array[low] = tmp;


        sort(array, 0, i - 1);
        sort(array, i + 1, high);

    }
}
