package sgyj.inflearn.yeji.section9;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Scanner;

// 동전교환
public class Solution5 {
    private static int n, m;
    private static int[] dy;

    private static int solution(int n, int[] coins, int result){
        Arrays.fill( dy,Integer.MAX_VALUE );
        dy[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=coins[i]; j<=m; j++){
                dy[j]=Math.min( dy[j],dy[j-coins[i]]+1 );
            }
        }

        return dy[m];
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dy = new int[m+1];
        System.out.println(solution( n,arr,m ));
    }

}
