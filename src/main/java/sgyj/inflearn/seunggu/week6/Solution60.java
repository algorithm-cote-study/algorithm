package sgyj.inflearn.seunggu.week6;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution60 {

    // BFS 넓이 우선 탐색 ( BreadTh - First - Search )
    // 레벨 탐색을 함.
    // queue 를 사용해서 탐색함.
    public static void main ( String[] args ) {
        Node root = Node.createNode(1);
        root.lt = Node.createNode( 2 );
        root.rt = Node.createNode( 3 );
        root.lt.lt = Node.createNode( 4 );
        root.lt.rt = Node.createNode( 5 );
        root.rt.lt = Node.createNode( 6 );
        root.rt.rt = Node.createNode( 7 );
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
                System.out.print(cur.data + " ");
                if(cur.lt != null ) q.add( cur.lt );
                if(cur.rt != null ) q.add( cur.rt );
            }
            System.out.println();
            l++;
        }
    }
}
