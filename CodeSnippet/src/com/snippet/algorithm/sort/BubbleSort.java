package com.snippet.algorithm.sort;

/**
 * 冒泡排序
 *
 */
public class BubbleSort
{
    /**
     * 第1版
     * 初始版本
     *
     * @param array
     */
    public void sort1(int[] array)
    {
        if (null == array || array.length < 2)
        {
            return;
        }

        int tmp = 0;

        for (int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }


    /**
     * 第2版
     * 在第1版的基础上优化后，可以判断整个数组是否已全部有序
     *
     * @param array
     */
    public void sort2(int[] array)
    {
        if (null == array || array.length < 2)
        {
            return;
        }

        int tmp = 0;
        // 有序标记，每一轮比较的初始是true；若有数据交换，则设置为false；
        // 若一轮比较结束，仍然是true，则说明整个数组已经有序，排序完成
        boolean isSorted;

        for (int i = 0; i < array.length; i++)
        {
            isSorted = true;
            for(int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    // 若有数据交换，则设置为false；
                    isSorted = false;
                }
            }

            // 若一轮比较结束，仍然是true，则说明整个数组已经有序，排序完成
            if (isSorted)
            {
                break;
            }
        }
    }

    /**
     * 第3版
     * 在第2版的基础上优化后，可以减少比较次数
     *
     * @param array
     */
    public void sort3(int[] array)
    {
        if (null == array || array.length < 2)
        {
            return;
        }

        int tmp = 0;
        boolean isSorted;
        // 最后一次交换的位置
        int lastExchangeIndex = 0;
        // 无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = array.length - 1;

        for (int i = 0; i < array.length; i++)
        {
            isSorted = true;
            for(int j = 0; j < sortBorder; j++)
            {
                if (array[j] > array[j + 1])
                {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                    isSorted = false;

                    // 把无序数列的边界更新为最后一次交换元素的位置
                    // 边界左边，仍是无序数组；边界右边，已经有序，无须比较
                    lastExchangeIndex = j;
                }
            }

            if (isSorted)
            {
                break;
            }

            // 把无序数列的边界更新为最后一次交换元素的位置
            // 边界左边，仍是无序数组；边界右边，已经有序，无须比较
            sortBorder = lastExchangeIndex;
        }
    }

    /**
     * 鸡尾酒排序
     * 即双向冒泡排序，冒泡排序的升级版
     *
     * @param array
     */
    public void cocktailSort1(int[] array)
    {

    }

    public void cocktailSort2(int[] array)
    {

    }
}
