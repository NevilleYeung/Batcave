package com.snippet.practice;

import java.util.ArrayList;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。
 *
 * 求按从小到大的顺序的第N个丑数。
 */
public class UglyNumber
{

    private ArrayList<Integer> unList = null;

    public UglyNumber()
    {
        unList = new ArrayList<Integer>();
        unList.add(1);
        unList.add(2);
        unList.add(3);
        unList.add(4);
        unList.add(5);
    }

    /**
     * 建议使用
     */
    public int getUglyNumEfficiently(int index)
    {
        if (index < 1)
        {
            return 0;
        }
        if (index <= unList.size())
        {
            return unList.get(index - 1);
        }

        int num2 = 0;
        int num3 = 0;
        int num5 = 0;

        for (int j = unList.size(); j < index; j++)
        {
            for (int i : unList)
            {
                num2 = i * 2;
                if (unList.get(unList.size() - 1) < num2)
                {
                    break;
                }
            }

            for (int i : unList)
            {
                num3 = i * 3;
                if (unList.get(unList.size() - 1) < num3)
                {
                    break;
                }
            }

            for (int i : unList)
            {
                num5 = i * 5;
                if (unList.get(unList.size() - 1) < num5)
                {
                    break;
                }
            }

            int tmp = (num2 < num3) ? num2 : num3;
            unList.add(tmp < num5 ? tmp : num5);

        }

        return unList.get(unList.size() - 1);
    }

    /**
     * 朴素而缓慢的方法
     */
    public int getUglyNum(int index)
    {
        if (index < 1)
        {
            return 0;
        }
        if (index == 1)
        {
            return 1;
        }

        int num = 1;
        int i = 1;
        while (i < index)
        {
            num++;
            if (isUglyNumber(num))
            {
                i++;
            }

        }

        return num;
    }

    private boolean isUglyNumber(int num)
    {
        while (num % 2 == 0)
        {
            num = num / 2;
        }
        while (num % 5 == 0)
        {
            num = num / 5;
        }
        while (num % 3 == 0)
        {
            num = num / 3;
        }

        if (num == 1)
        {
            return true;
        }
        return false;
    }
}
