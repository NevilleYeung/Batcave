package com.snippet.practice;

import org.junit.Test;

public class BinaryTreeImageTest
{
    private BinaryTreeImage binaryTreeImage = new BinaryTreeImage();

    @Test
    public void mirror() throws Exception
    {
        //      8
        //    /  \
        //   6   10
        //  / \  / \
        // 5  7 9 11
        TreeNode treeNode = new TreeNode(8);
        treeNode.left = new TreeNode(6);
        treeNode.left.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(7);

        treeNode.right = new TreeNode(10);
        treeNode.right.left = new TreeNode(9);
        treeNode.right.right = new TreeNode(11);

        //
        binaryTreeImage.mirror(treeNode);

        //
        printBinaryTree(treeNode);
    }


    private void printBinaryTree(TreeNode treeNode)
    {
        if (treeNode != null)
        {
            System.out.println(treeNode.val);

            printBinaryTree(treeNode.left);
            printBinaryTree(treeNode.right);
        }
    }
}