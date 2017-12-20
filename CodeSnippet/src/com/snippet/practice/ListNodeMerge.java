package com.snippet.practice;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，合成后的链表满足单调不减规则。
 *
 *
 */
public class ListNodeMerge
{
    /**
     * 非递归版本
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1, ListNode list2)
    {
        // validate params
        if (list1 == null || list2 == null)
        {
            return (list1 != null) ? list1 : list2;
        }

        // get the head node
        ListNode head = list1;
        if (list1.val >= list2.val)
        {
            head = list2;
        }

        // begin to ...
        ListNode pre = null;
        ListNode tmp = null;

        while (list1 != null)
        {
            // 1
            if (list2 == null)
            {
                break;
            }

            // 2
            if (list1.next == null)
            {
                if (list1.val >= list2.val)
                {
                    if (pre != null)
                    {
                        pre.next = list2;
                    }
                    pre = list2;

                    tmp = list2.next;
                    list2.next = list1;
                    list2 = tmp;

                    continue;
                }
                else
                {
                    list1.next = list2;
                    break;
                }
            }
            else
            {
                if (list1.val >= list2.val)
                {
                    if (pre != null)
                    {
                        pre.next = list2;
                    }
                    pre = list2;

                    tmp = list2.next;
                    list2.next = list1;
                    list2 = tmp;

                    continue;
                }
                else
                {
                    pre = list1;

                }
            }


            list1 = list1.next;
        }

        return head;
    }


    /**
     * 递归版本，来源于网络
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge1(ListNode list1, ListNode list2)
    {
        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }
        if(list1.val <= list2.val)
        {
            list1.next = Merge(list1.next, list2);
            return list1;
        }
        else
        {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}