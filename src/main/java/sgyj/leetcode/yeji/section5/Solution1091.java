package sgyj.leetcode.yeji.section5;

import java.util.ArrayDeque;
import java.util.Deque;

// 1091. Shortest Path in Binary Matrix
public class Solution1091 {
    private static int[] dx = {-1,1,0,0,1,1,-1,-1};
    private static int[] dy = {0,0,-1,1,1,-1,-1,1};
    private static boolean[][] visited;

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int answer = -1;
        int n = grid.length;
        visited = new boolean[n][n];

        Deque<Location> q = new ArrayDeque<>();
        if(grid[0][0] != 0) return -1;
        visited[0][0] = true;
        q.offer( new Location(0,0,1 ) );
        while ( !q.isEmpty() ){
            int len = q.size();
            for(int i=0; i<len; i++){
                Location curNode = q.poll();
                if(curNode.x == n-1 && curNode.y == n-1) {
                    answer = curNode.len;
                    break;
                }
                for(int d=0; d<dx.length; d++){
                    int x = curNode.x + dx[d];
                    int y = curNode.y + dy[d];
                    if(x>=0 && x<n && y>=0 && y<n && !visited[x][y] && grid[x][y] == 0){
                        visited[x][y] = true;
                        q.offer( new Location( x,y , curNode.len+1 ) );
                    }
                }
            }
        }
        return answer;
    }

    public static void main ( String[] args ) {
        int[][] grid = {
//            [[0,0,0],[1,1,0],[1,1,0]]
            {0,0,0},{1,1,0},{1,1,0}
        };

        System.out.println(shortestPathBinaryMatrix( grid ));
    }
}
