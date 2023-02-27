package sgyj.leetcode.yeji.section5;

import java.util.ArrayDeque;
import java.util.Deque;

// 200. Number of Islands
public class Solution200 {
    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,-1,1};
    private static int m;
    private static int n;
    private static char[][] targetGrid;
    private static boolean[][] visited;

    public static int numIslands(char[][] grid) {
        int answer = 0;
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        targetGrid = grid;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && grid[i][j]==49){
                    bfs(i,j);
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void bfs(int x, int y){
        Deque<Location> q = new ArrayDeque<>();
        q.offer( new Location( x,y ) );
        visited[x][y] = true;
        while ( !q.isEmpty() ){
            Location currentNode = q.poll();
            for(int d=0; d<dx.length; d++){
                int curX = currentNode.x + dx[d];
                int curY = currentNode.y + dy[d];
                if(curX>=0 && curX<m && curY>=0 && curY<n){
                    if(targetGrid[curX][curY] != 48 && !visited[curX][curY]){
                        visited[curX][curY] = true;
                        q.offer( new Location( curX,curY ) );
                    }
                }
            }
        }
    }


    public static void main ( String[] args ) {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println(numIslands(grid));

    }

}

class  Location{
    int x;
    int y;

    int len;

    Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    Location(int x, int y, int len){
        this.x = x;
        this.y = y;
        this.len = len;
    }
}