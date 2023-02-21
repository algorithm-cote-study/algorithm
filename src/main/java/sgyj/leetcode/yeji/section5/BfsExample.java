package sgyj.leetcode.yeji.section5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BfsExample {
    private static List<Integer> visited = new ArrayList<>();

    private void bfs(Node root){
        if(root == null){
            System.out.println(0);
            return;
        }
        Deque<Node> q = new ArrayDeque<>();
        q.offer( root );
        while ( !q.isEmpty() ){
            Node currentNode = q.pop();
            visited.add( currentNode.value );

            if(currentNode.left != null){
                q.offer( currentNode.left );
            }
            if(currentNode.right != null){
                q.offer( currentNode.right );
            }
        }

    }

    public static void main ( String[] args ) {

    }
}
