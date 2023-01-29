package sgyj.inflearn.seunggu.section7;

import java.util.ArrayDeque;
import java.util.Deque;
import sgyj.inflearn.seunggu.section6.Node;

public class Solution7 {

    // BFS 넓이 우선 탐색 ( BreadTh - First - Search )
    // 레벨 탐색을 함.
    // queue 를 사용해서 탐색함.
    public static void main ( String[] args ) {
        Node root = Node.createNode( 1);
        root.setLt( Node.createNode( 2 ));
        root.setRt( Node.createNode( 3 ));
        root.getLt().setLt( Node.createNode( 4 ) );
        root.getLt().setRt( Node.createNode( 5 ));
        root.getRt().setLt( Node.createNode( 6 ));
        root.getRt().setLt( Node.createNode( 7 ));
        BFS(root);
    }

    static void BFS(Node root) {
        Deque<Node> q = new ArrayDeque<>();
        q.add(root);
        int l = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0 ;i<len; i++) {
                var cur = q.pop();
                System.out.print(cur.getData() + " ");
                if(cur.getLt() != null ) q.add( cur.getLt() );
                if(cur.getRt() != null ) q.add( cur.getRt() );
            }
            System.out.println();
            l++;
        }
    }
}
