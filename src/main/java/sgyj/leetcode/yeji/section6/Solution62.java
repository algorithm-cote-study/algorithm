package sgyj.leetcode.yeji.section6;

// 62. Unique Paths
/*
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
The test cases are generated so that the answer will be less than or equal to 2 * 109.
*/

public class Solution62 {
    private static int[][] visited;
    private static int answer = 0;
    public static int uniquePaths(int m, int n) {

        visited = new int[m][n];
        visited[0][0] = 1;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int dx = 0;
                int dy = 0;
                if(i-1>=0){
                    dx = visited[i-1][j];
                }
                if(j-1>=0){
                    dy = visited[i][j-1];
                }
                visited[i][j] = dx+dy == 0 ? 1 : dx+dy;
            }
        }

        return visited[m-1][n-1];
    }

    public static void main ( String[] args ) {
        int m = 3;
        int n = 2;

        System.out.println(uniquePaths(m,n));

    }
}
