package test.com.snippet.practice;

import static org.junit.Assert.*;

import com.snippet.practice.ListNode;
import com.snippet.practice.ListNodeReverse;
import org.junit.Test;

public class ListNodeReverseTest
{
    private ListNode list;

    @Test
    public void reverseList01() throws Exception
    {
        list = new ListNode(1);
        ListNode ls1_tmp = list;

        // input
        for (int i = 0 ; i < 4; i++)
        {
            // 1 3 5 7 9
            ls1_tmp.next = new ListNode(ls1_tmp.val + 2);
            ls1_tmp = ls1_tmp.next;
        }
        printList(list, "input");


        ListNodeReverse listNodeReverse = new ListNodeReverse();
        ListNode output = listNodeReverse.ReverseList(list);

        // expectedResult = {9, 7, 5, 3, 1}
        ListNode expectedResult = new ListNode(9);
        ListNode r_tmp = expectedResult;
        for (int i = 9 ; i > 1; )
        {
            r_tmp.next = new ListNode(i - 2);
            r_tmp = r_tmp.next;

            i = i - 2;
        }
        printList(expectedResult, "expectedResult");
        printList(output, "output");

        // check
        while (expectedResult != null)
        {
            assertNotNull(output);
            assertNotNull(expectedResult);
            assertEquals(expectedResult.val, output.val);

            expectedResult = expectedResult.next;
            output = output.next;
        }
    }


    private void printList(ListNode list, String title)
    {
        System.out.print(title + "=");
        while (list != null)
        {
            System.out.print(" " + list.val);
            list = list.next;
        }
        System.out.println();
    }
}