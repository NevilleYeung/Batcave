package com.snippet.practice;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * 二叉树的镜像定义：源二叉树
 *      8
 *    /  \
 *   6   10
 *  / \  / \
 * 5  7 9 11
 *镜像二叉树
 *     8
 *   /  \
 *  10   6
 * / \  / \
 *11 9 7  5
 *
 */
public class BinaryTreeImage
{
    public void mirror(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        if (root.left == null && root.right == null)
        {
            return;
        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirror(root.left);
        mirror(root.right);
    }
}
