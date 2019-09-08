package com.snippet.practice;

import java.util.Arrays;

/**
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....
 * LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。
 *
 * =======================================
 * 输入5张牌，判断是否为顺子。
 * 大小王是0，共4张；存在重复的牌。
 */
public class PokerFace
{

    public boolean isContinuous(int[] numbers)
    {
        if (numbers == null || numbers.length != 5)
        {
            return false;
        }
        // 不能存在重复数字
        if (isRepeated(numbers))
        {
            return false;
        }
        // 4个0的场景
        int zeroNum = getZeroNum(numbers);
        if (zeroNum >= 4)
        {
            return true;
        }

        // 由小到大排序
        Arrays.sort(numbers);

        if (numbers[numbers.length - 1] - numbers[zeroNum] < 5 )
        {
            return true;
        }

        return false;
    }

    /**
     * 是否存在非0的重复数字
     */
    private boolean isRepeated(int[] array)
    {
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                //如果相等，则重复
                if (array[i] == array[j])
                {
                    if (array[i] == 0)
                    {
                        continue;
                    }
                    flag = true;
                    break;
                }
            }

            if (flag)
            {
                return flag;
            }
        }

        return flag;
    }

    /**
     * 计算0值的数量
     */
    private int getZeroNum(int[] nums)
    {
        int num = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                num++;
            }
        }

        return num;
    }
}
