package sgyj.leetcode.yeji.section5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution236 {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }

    public static void main ( String[] args ) {
        // 3,5,1,6,2,0,8,null,null,7,4
        TreeNode p = new TreeNode( 5 );
        TreeNode q = new TreeNode( 4 );
        TreeNode root = new TreeNode( 3 );
        root.left = new TreeNode( 5 );
        root.right = new TreeNode( 1 );
        root.left.left = new TreeNode( 6 );
        root.left.right = new TreeNode( 2 );
        root.right.left = new TreeNode( 0 );
        root.right.right = new TreeNode( 8 );
        root.left.right.left = new TreeNode( 7 );
        root.left.right.right = new TreeNode( 4 );
        TreeNode treeNode = lowestCommonAncestor( root, p, q );
        System.out.println(treeNode.val);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val = x;
    }
}