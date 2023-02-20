package sgyj.leetcode.seunggu.section5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BfsExample {
    private static List<String> visited;

    public static void main ( String[] args ) {
        visited = new ArrayList<>();
        Node root = Node.of( "A" );
        root.left = Node.of("B");
        root.right = Node.of( "C" );
        root.left.left = Node.of("D");
        root.left.right = Node.of("E");
        root.left.left.left = Node.of( "G" );
        root.left.left.right = Node.of( "H" );
        root.right.right = Node.of( "F" );
        bfs( root );
        System.out.println(visited);
    }

    public static void bfs( Node root ) {
        if(root == null) return;
        Deque<Node> deque = new ArrayDeque<>();
        deque.add( root );
        while(!deque.isEmpty()) {
            Node node = deque.pop();
            visited.add( node.value );
            if(node.left != null) deque.add( node.left );
            if(node.right != null ) deque.add( node.right );
        }
    }

    static class Node {
        Node left;
        Node right;
        String value;

        private Node(String value) {
            this.value = value;
        }

        public static Node of ( String value ) {
            return new Node(value);
        }
    }
}
