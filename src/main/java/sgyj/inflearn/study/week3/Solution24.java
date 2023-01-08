package sgyj.inflearn.study.week3;

import java.util.Scanner;

public class Solution24 {

    public static int solution ( int n, int m, int[][] arr ){
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt = 0;
                for(int k=0; k<m; k++){
                    int pi=0,pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == m){
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );
        String[] input = sc.nextLine().split( " " );
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt( input[1] );
        int[][] inputValue = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                inputValue[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,m,inputValue));
    }

}
