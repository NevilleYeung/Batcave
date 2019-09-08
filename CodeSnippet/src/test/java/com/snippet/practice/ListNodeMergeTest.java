package com.snippet.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeMergeTest
{
    private ListNode list1;
    private ListNode list2;

    private ListNodeMerge listNodeMerge = new ListNodeMerge();

    @Test
    public void nullCase01() throws Exception
    {
        // input
        list1 = null;
        list2 = new ListNode(2);

        // output
        ListNode output = listNodeMerge.Merge(list1, list2);

        // expected result
        ListNode result = new ListNode(2);


        // check
        while (result != null)
        {
            assertNotNull(output);
            assertEquals(result.val, output.val);

            result = result.next;
            output = output.next;
        }
    }

    @Test
    public void nullCase02() throws Exception
    {
        // input
        list1 = new ListNode(-5);
        list2 = null;

        // output
        ListNode output = listNodeMerge.Merge(list1, list2);

        // expected result
        ListNode result = new ListNode(-5);


        // check
        while (result != null)
        {
            assertNotNull(output);
            assertEquals(result.val, output.val);

            result = result.next;
            output = output.next;
        }
    }

    @Test
    public void nullCase03() throws Exception
    {
        // input
        list1 = null;
        list2 = null;

        // output
        ListNode output = listNodeMerge.Merge(list1, list2);


        // check
        assertNull(output);
    }


    @Test
    public void merge01() throws Exception
    {
        list1 = new ListNode(1);
        list2 = new ListNode(2);

        ListNode ls1_tmp = list1;
        ListNode ls2_tmp = list2;

        // input
        for (int i = 0 ; i < 4; i++)
        {
            // 1 3 5 7 9
            ls1_tmp.next = new ListNode(ls1_tmp.val + 2);
            ls1_tmp = ls1_tmp.next;

            // 2 4 6 8 10
            ls2_tmp.next = new ListNode(ls2_tmp.val + 2);
            ls2_tmp = ls2_tmp.next;
        }

        // output
        ListNode output = listNodeMerge.Merge(list1, list2);

        // expected result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        ListNode result = new ListNode(1);
        ListNode r_tmp = result;
        for (int i = 1 ; i < 10; i++)
        {
            r_tmp.next = new ListNode(i + 1);
            r_tmp = r_tmp.next;
        }


        // check
        while (result != null)
        {
            assertNotNull(output);
            assertEquals(result.val, output.val);

            result = result.next;
            output = output.next;
        }
    }
}