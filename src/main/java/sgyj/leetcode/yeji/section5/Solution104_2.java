package sgyj.leetcode.yeji.section5;

public class Solution104_2 {

    public static int maxDepth( TreeNode root){
        int answer = 0;
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = maxDepth( root.left );
        int right = maxDepth( root.right );
        answer = Math.max( left,right );
        answer++;
        return answer;
    }
    //3,9,20,null,null,15,7
    public static void main ( String[] args ) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }
}