package sgyj.inflearn.yeji.section2;

import java.util.Scanner;

public class Solution10 {

    public static int solution(int n, int[][] input){
        int answer = 0;
        for(int i = 1; i<input.length-1; i++){
            for(int j=1; j<input.length-1; j++){
                int checkValue = Math.max(Math.max( input[i+1][j],input[i-1][j] ),Math.max( input[i][j+1],input[i][j-1] ));
                if(input[i][j] > checkValue) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int n = in.nextInt();
        int[][] input = new int[n+2][n+2];
        for(int i = 0; i<=n+1; i++){
            for(int j = 0; j<=n+1; j++){
                if(i == 0 || j == 0 ||  i == n+1 || j == n+1){
                    input[i][j] = 0;
                }else{
                    input[i][j] = in.nextInt();
                }
            }
        }
        System.out.print(solution( n,input ));
    }
}
