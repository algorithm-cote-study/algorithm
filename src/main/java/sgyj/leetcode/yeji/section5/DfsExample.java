package sgyj.leetcode.yeji.section5;

import java.util.ArrayList;
import java.util.List;

public class DfsExample {
    private static List<String> visited = new ArrayList<>();

    private static void dfs(Node root){
        if(root == null) return;
        visited.add( root.value );
        dfs( root.left );
        dfs( root.right );

    }

    public static void main ( String[] args ) {
        Node node = new Node("A");
        node.left = new Node( "B" );
        node.right = new Node( "C" );
        node.left.left = new Node("D");
        node.left.right = new Node("E");
        dfs( node );
        for ( String v : visited ) {System.out.println(v + " ");}
    }
}
