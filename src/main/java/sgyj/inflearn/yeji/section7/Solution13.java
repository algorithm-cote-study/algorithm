package sgyj.inflearn.yeji.section7;

import java.util.LinkedList;
import java.util.Queue;

public class Solution13 {
    static int answer = 0;
    static int n;
    static int m;
    static int[][] graph;
    static int[] visited;
    static int[] visitedDistance;

    public static void BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer( v );
        while ( !Q.isEmpty() ){
            int len = Q.size();
            for(int i = 0; i<len; i++){
                int t = Q.poll();
                for(int j = 0; j<graph.length; j++){
                    if(graph[j][0] == t && visited[graph[j][1]] == 0){
                        visited[graph[j][1]] = 1;
                        visitedDistance[graph[j][1]] = visitedDistance[t] + 1;
                        Q.offer( graph[j][1] );
                    }
                }
            }
        }

        for(int i =1; i<visitedDistance.length; i++){
            System.out.println(i + ": " + visitedDistance[i]);
        }
    }

    public static void main ( String[] args ) {
        n = 6;
        m = 9;
        visited = new int[n+1];
        visitedDistance = new int[n+1];
        graph = new int[][]{
            {1,3},
            {1,4},
            {2,1},
            {2,5},
            {3,4},
            {4,5},
            {4,6},
            {6,2},
            {6,5}
        };
        visited[1] = 1;
        BFS(1);
        System.out.println(answer);
    }
}
