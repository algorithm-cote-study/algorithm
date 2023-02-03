package sgyj.inflearn.yeji.section8;

import java.util.Scanner;

public class Solution13 {
    // 섬나라 아일랜드 (DFS)
    static int[][] input;
    static int[][] visited;
    static int answer = 0;
    static int[] dx = {1,1,0,-1,-1,-1,0,1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};

    static void findIsland(int x, int y){
        if(input[x][y]==0){
            return;
        }else{
            visited[x][y]=1;
            for(int d=0; d<dx.length; d++){
                int tx= x+dx[d];
                int ty= y+dy[d];
                if(tx>=0 && tx<visited.length && ty>=0 && ty<visited.length && visited[tx][ty]==0){
                    findIsland(tx,ty);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        input = new int[n][n];
        visited = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                input[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(input[i][j] == 1 && visited[i][j]==0){
                    findIsland( i ,j);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
