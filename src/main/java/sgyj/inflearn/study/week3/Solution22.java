package sgyj.inflearn.study.week3;

import java.util.Scanner;

public class Solution22 {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static int solution ( int n, int[][] arr ){
        int answer = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr.length; j++ ) {
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n &&  arr[nx][ny]>=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main ( String[] args ) {
        Solution21 solution21 = new Solution21();
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr.length; j++ ) {
                arr[i][j] =  scanner.nextInt();
            }
        }
        System.out.println(solution(n,arr));
    }
}
