package com.snippet.practice;

public class ReConstructBinaryTree
{

    public TreeNode reConstructBinaryTree(int[] pre, int[] in)
    {
        if (pre == null || in == null)
        {
            return null;
        }
        if (pre.length == 0 || in.length == 0 || pre.length != in.length)
        {
            return null;
        }
        if (pre.length == 1)
        {
            return new TreeNode(pre[0]);
        }

        TreeNode root = new TreeNode(pre[0]);

        // find the root index in in[]
        int i = 0;
        for (; i < in.length; i++)
        {
            if (pre[0] == in[i])
            {
                break;
            }
        }

        // 分而治之
        // TODO 数组拷贝太浪费空间了，待新建方法优化
        int[] pre_left = new int[i];
        int[] pre_right = new int[pre.length - i - 1];
        int[] in_left = new int[i];
        int[] in_right = new int[in.length - i - 1];

        for (int j = 0; j < i; j++)
        {
            pre_left[j] = pre[j + 1];
        }
        for (int j = 0; j < i; j++)
        {
            in_left[j] = in[j];
        }
        System.arraycopy(pre, i + 1, pre_right, 0, pre.length - i - 1);
        System.arraycopy(in, i + 1, in_right, 0, in.length - i - 1);

        root.left = reConstructBinaryTree(pre_left, in_left);
        root.right = reConstructBinaryTree(pre_right, in_right);

        return root;
    }
}
