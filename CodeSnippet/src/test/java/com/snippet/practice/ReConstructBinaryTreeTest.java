package com.snippet.practice;

import org.junit.Test;

public class ReConstructBinaryTreeTest
{
    private ReConstructBinaryTree rc = new ReConstructBinaryTree();

    @Test
    public void reConstructBinaryTree() throws Exception
    {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        TreeNode tree = rc.reConstructBinaryTree(pre, in);

        System.out.println(tree);
    }

}