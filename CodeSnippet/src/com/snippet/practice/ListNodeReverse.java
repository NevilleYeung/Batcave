package com.snippet.practice;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ListNodeReverse
{
    public ListNode ReverseList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode pre = null;
        ListNode next = null;
        ListNode n_next = null;

        while (head != null)
        {
            next = head.next;

            if (next != null)
            {
                n_next = next.next;
                next.next = head;
            }
            else
            {
                head.next = pre;
                break;
            }

            head.next = pre;
            pre = next;
            head = n_next;
        }

        return head;
    }
}