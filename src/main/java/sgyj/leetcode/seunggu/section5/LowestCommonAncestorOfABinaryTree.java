package sgyj.leetcode.seunggu.section5;

import java.util.Objects;

public class LowestCommonAncestorOfABinaryTree {

    private static TreeNode answer;
    private static boolean isEquals;
    public static void main ( String[] args ) {
        TreeNode root = new TreeNode( 3 );
        root.left = new TreeNode( 5 );
        root.left.left = new TreeNode( 6 );
        root.left.right = new TreeNode( 2 );
        root.left.right.left = new TreeNode( 7 );
        root.left.right.right = new TreeNode( 4 );
        root.right = new TreeNode( 1 );
        root.right.left = new TreeNode( 0 );
        root.right.right = new TreeNode( 8 );
        System.out.println(lowestCommonAncestor(root, new TreeNode( 5 ), new TreeNode( 1 )));
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p , q);
        isEquals = false;
        return answer;
    }

    public static boolean dfs(TreeNode treeNode, TreeNode p, TreeNode q) {
        if(treeNode == null || isEquals) {
            return false;
        }
        boolean left = dfs(treeNode.left, p, q);
        boolean right = dfs(treeNode.right, p, q);
        // 내 자식 left & right 둘 다 true ? 그러면 내가 최하위 부모네 그럼 정답
        // 내가 스스로 true 고, 아래 자식들 둘중 하나가 true 라면 내 자신이 최하위 부모네.
        if( left && right || (isSame(treeNode, p, q) && (left || right))) {
            isEquals = true;
            answer = treeNode;
            return false;
        }
        // 자식들 중 하나 true 거나 내가 true 면 부모한테도 내가 true인 걸 알려줘야해
        return left || right || isSame( treeNode, p, q );
    }

    public static boolean isSame(TreeNode treeNode, TreeNode p, TreeNode q) {
        return treeNode.equals( p ) || treeNode.equals( q );
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        @Override
        public String toString () {
            return val+"";
        }

        @Override
        public int hashCode () {
            return Objects.hash( val, left, right );
        }

        @Override
        public boolean equals( Object o ) {
            if ( this == o ) {return true;}
            if ( o == null || getClass() != o.getClass() ) {return false;}
            TreeNode treeNode = (TreeNode) o;
            return treeNode.val == this.val;
        }
    }
}
