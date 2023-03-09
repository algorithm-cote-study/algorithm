package sgyj.programmers.yeji.dfsbfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1844 {
    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,-1,0,1};
    private static boolean[][] visited;

    public static int solution(int[][] maps) {
        int answer = 1;
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m];
        Deque<MapNode> q = new ArrayDeque<>();
        q.offer( new MapNode( 0,0 ) );
        visited[0][0]=true;
        while ( !q.isEmpty() ){
            int len = q.size();
            for(int i=0; i<len; i++){
                MapNode curNode = q.poll();
                for(int d=0; d<dx.length; d++){
                    int x = curNode.x + dx[d];
                    int y = curNode.y + dy[d];
                    if(x==n-1 && y==m-1) return answer+1;
                    if(x>=0 && x<n && y>=0 && y<m && !visited[x][y] && maps[x][y] == 1){
                        visited[x][y] = true;
                        q.offer( new MapNode( x,y ) );
                    }
                }
            }
            answer++;
        }

        return -1;
    }

    public static void main ( String[] args ) {
        // [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]
        int[][] maps= {
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,0,1,1,1},
            {1,1,1,0,1},
            {0,0,0,0,1}
        };
        System.out.println(solution(maps));
    }

}

class MapNode{
    int x;
    int y;

    MapNode(int x, int y){
        this.x = x;
        this.y = y;
    }
}
