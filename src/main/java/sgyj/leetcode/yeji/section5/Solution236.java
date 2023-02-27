package sgyj.leetcode.yeji.section5;

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

    public static Child lowestCommonAncestor( Child root, Child p, Child q) {
        return null;
    }

    public static void main ( String[] args ) {
        // 3,5,1,6,2,0,8,null,null,7,4
        Child p = new Child( 5 );
        Child q = new Child( 4 );
        Child root = new Child( 3 );
        root.left = new Child( 5 );
        root.right = new Child( 1 );
        root.left.left = new Child( 6 );
        root.left.right = new Child( 2 );
        root.right.left = new Child( 0 );
        root.right.right = new Child( 8 );
        root.left.right.left = new Child( 7 );
        root.left.right.right = new Child( 4 );
        Child treeNode = lowestCommonAncestor( root, p, q );
        System.out.println(treeNode.val);
    }
}

class Child {
    int val;
    Child left;
    Child right;
    Child ( int x){
        this.val = x;
    }
}