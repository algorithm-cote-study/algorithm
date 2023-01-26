package sgyj.inflearn.seunggu.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution58 {
    /**
     * @title : 이진 트리 순회 ( 깊이 우선 탐색 ) DFS
     * @description : 이진트리를 전위순회와 후위순회를 연습해 보세요.
     *                전위순회 출력 : 1 2 4 5 3 6 7
     *                중위순회 출력 : 4 2 5 1 6 3 7
     *                후위순회 출력 : 4 5 2 6 7 3 1
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            // 부모 방문 , 왼쪽 자식 , 오른쪽 자식 --> 전위 순회
            // 왼쪽 자식 방문, 부모방문, 오른쪽 자식 방문 --> 중위 순회
            // 오른쪽 자식 방문, 부모 방문, 왼쪽 자식 방문 --> 후위 순회
            Node root = Node.createNode(1);
            root.lt = Node.createNode( 2 );
            root.rt = Node.createNode( 3 );
            root.lt.lt = Node.createNode( 4 );
            root.lt.rt = Node.createNode( 5 );
            root.rt.lt = Node.createNode( 6 );
            root.rt.rt = Node.createNode( 7 );

            DFS(root);

            System.out.println(4 * 4 * 4);

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static void DFS(Node root) {
        if(root == null) return;
        DFS(root.lt);
        DFS(root.rt);
        System.out.print(root.data + " ");  // 위치에 따라 전위, 순위, 후위가 결정된다.
    }


}
