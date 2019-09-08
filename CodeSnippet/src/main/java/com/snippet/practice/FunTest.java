package com.snippet.practice;

public class FunTest
{

    /**
     * TODO will delete
     * @param args
     */
    public static void main(String[] args)
    {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list1tmp = list1;
        ListNode list2tmp = list2;

        // TODO ======TEST1=========
//        ListNode list1tmp = list1;
//        ListNode list2tmp = list2;
//
//        for (int i = 0 ; i < 3; i++)
//        {
//            if (i == 2)
//            {
//                list1tmp.next = new ListNode(list1tmp.val + 5);
//                list1tmp = list1tmp.next;
//                continue;
//            }
////            list1tmp.next = new ListNode(list1tmp.val + 2);
//            list2tmp.next = new ListNode(list2tmp.val + 2);
//
////            list1tmp = list1tmp.next;
//            list2tmp = list2tmp.next;
//        }
//
//        for (int i = 1 ; i < 4; i++)
//        {
//            list2tmp.next = new ListNode(list2tmp.val + 2);
//            list2tmp = list2tmp.next;
//        }


        // TODO ======TEST2=========

        for (int i = 0 ; i < 3; i++)
        {
            list1tmp.next = new ListNode(list1tmp.val + 2);
            list1tmp = list1tmp.next;
        }

        int [] as = {2, 6, 7, 7, 10, 11};
        for (int a: as)
        {
            list2tmp.next = new ListNode(a);
            list2tmp = list2tmp.next;
        }

        // ========================



        printList(list1);
        printList(list2);

        ListNodeMerge ss = new ListNodeMerge();


        ListNode list = ss.Merge(list1, list2);

        System.out.println("test");
        System.out.println(list);

        printList(list);
    }

    private static void printList (ListNode list)
    {
        while (list != null)
        {
            System.out.println("val=" + list.val);

            list = list.next;
        }

        System.out.println();
    }
}
