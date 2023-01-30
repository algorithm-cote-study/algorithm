package sgyj.inflearn.yeji.section8;

import java.util.Arrays;
import java.util.Scanner;

public class Solution9 {
    // 조합 구하기
    static int[] combi;
    static int n,m;
    public static void DFS(int L, int s){
        if(L==m){
            for ( int x : combi ) {System.out.print(x+ " ");}
            System.out.println();
        }else{
            for(int i=s; i<=n; i++){
                combi[L] = i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int[] input = Arrays.stream( sc.nextLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        n = input[0];
        m = input[1];
        combi = new int[m];
        DFS(0,1);
    }
}
