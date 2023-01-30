package sgyj.inflearn.yeji.section8;

import java.util.Scanner;

public class Solution10 {

    static int answer = 0;
    static int[][] input;
    static int[] location =  {1,0,-1,0};
    static int[][] visited;
    public static void solution(){
        findWay(0,0);
    }

    static void findWay(int x, int y){
//        if(x>6 || y>6) return;
        if(x>6||y>6) return;
        if(x==6&&y==6) {
            answer++;
            return;
        }
        if(x==-1||y==-1) return;
        if(input[x][y]==0 && visited[x][y]==0) {
            visited[x][y]=1;
            findWay( x+location[0],y+location[1] );
            findWay( x+location[1],y+location[0] );
            findWay( x+location[2],y+location[3] );
            findWay( x+location[3],y+location[2] );
            visited[x][y]=0;

        }
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        input = new int[7][7];
        visited = new int[7][7];
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                input[i][j] = sc.nextInt();
            }
        }
        solution( );
        System.out.println(answer);
    }
}
