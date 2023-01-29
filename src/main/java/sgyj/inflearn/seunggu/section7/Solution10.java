package sgyj.inflearn.seunggu.section7;

import java.util.ArrayDeque;
import java.util.Deque;
import sgyj.inflearn.seunggu.section6.Node;

public class Solution10 {

    /**
     * 아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
     * 각 경로의 길이는 루투노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.
     * 가장 짧은 길이는 3번 노드까지의 길이인 1입니다.
     * @param args
     */
    public static void main ( String[] args ) {
        Node root = Node.createNode( 1);
        root.setLt(Node.createNode( 2 ));
        root.setRt( Node.createNode( 3 ) );
        root.getLt().setLt( Node.createNode( 4 ) );
        root.getLt().setRt( Node.createNode( 5 ) );
        System.out.println(BFS( root ));
    }

    private static int BFS ( Node root ) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add( root );
        int l = 0;
        while(true) {
            int len = deque.size();
            for(int i=0; i<len; i++) {
                Node cur = deque.pop();
                if(cur.getLt() == null && cur.getRt() == null) return l;
                if(cur.getLt() != null) deque.add( cur.getLt() );
                if(cur.getRt() != null) deque.add( cur.getRt() );
            }
            l++;
        }

    }
}
