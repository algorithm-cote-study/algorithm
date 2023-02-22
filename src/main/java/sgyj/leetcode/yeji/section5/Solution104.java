package sgyj.leetcode.yeji.section5;

//104. Maximum Depth of Binary Tree

import com.sun.source.tree.Tree;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        int answer = 0;
        if(root == null) return 0;
        Deque<TreeNode> q = new ArrayDeque<>();
        root.updateDepth();
        q.offer(root );
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                TreeNode node = q.poll();
                if(node.left != null){
                    node.left.updateDepth();
                    q.offer( node.left );
                }
                if(node.right != null){
                    node.right.updateDepth();
                    q.offer( node.right );
                }
            }
            answer++;
        }

        return answer;
    }

    public static void main ( String[] args ) {

    }
}

class TreeNode{
    int val;
    int depth;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void updateDepth (){
        this.depth++;
    }
}