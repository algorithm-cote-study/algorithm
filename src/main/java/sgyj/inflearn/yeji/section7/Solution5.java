package sgyj.inflearn.yeji.section7;

import sgyj.inflearn.yeji.section6.Node;

public class Solution5 {
    Node root;
    public void DFS(Node root){
        if(root == null) return;
        else{
            // 전위순회
            System.out.print(root.getData() + " ");
            DFS(root.lt);
            // 중위순회
            System.out.print(root.getData() + " ");
            DFS(root.rt);
            // 후위순회
            System.out.print(root.getData() + " ");
        }
    }

    public static void main ( String[] args ) {
        Solution5 tree = new Solution5();
        tree.root = new Node( 1 );
        tree.root.lt = new Node( 2 );
        tree.root.rt = new Node( 3 );
        tree.root.lt.lt = new Node( 4 );
        tree.root.lt.rt = new Node( 5 );
        tree.root.rt.lt = new Node( 6 );
        tree.root.rt.rt = new Node( 7 );
        tree.DFS(tree.root);
    }
}
