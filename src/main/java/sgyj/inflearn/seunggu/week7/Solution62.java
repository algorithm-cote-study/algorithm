package sgyj.inflearn.seunggu.week7;

import java.util.ArrayDeque;
import java.util.Deque;
import sgyj.inflearn.seunggu.week6.Node;

public class Solution62 {

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
        System.out.println(DFS(0, root));
    }

    private static int DFS ( int l, Node root ) {
        if(root.getLt() == null && root.getRt() == null) return l;
        return Math.min( DFS(l+1, root.getLt()), DFS(l+1, root.getRt()) );
    }
}
