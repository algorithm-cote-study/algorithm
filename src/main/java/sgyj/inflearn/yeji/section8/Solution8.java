package sgyj.inflearn.yeji.section8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution8 {
    // 솔루션 추측하기
    static int[][] dy;
    static int[] arr;
    static int[] pm;
    static int[] visited;
    static boolean flag=false;
    static int[] result;
    static int[] solution(int n, int max){
        makePermutation(0,n,max);
        return pm;
    }

    static void makePermutation(int L,int n, int max){
        if(flag) return;
        if(L==n){
            if(checkMax(n,max)) {
                result = new int[n];
                System.arraycopy( pm, 0, result, 0, pm.length );
                for(int r : result){
                    System.out.print(r + " ");
                }
                flag=true;
            }
        }else{
            for(int i=0; i<n; i++){
                if(visited[i]==0){
                    visited[i] = 1;
                    pm[L] = arr[i];
                    makePermutation( L+1,n,max );
                    visited[i] = 0;
                }
            }

        }
    }

    static boolean checkMax(int n, int max){
        int L = n;
        int i =0;
        int[] check = new int[n];
        System.arraycopy( pm, 0, check, 0, pm.length );
        while(L != 1){
            if(i==L-1){
                i=0;
                L--;
                continue;
            }
            check[i] = check[i] + check[i+1];
            i++;
        }
        return check[0] == max;
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int[] n = Arrays.stream( sc.nextLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        dy = new int[n[0]][n[0]];
        arr = IntStream.rangeClosed(1,n[0]).toArray();
        visited = new int[n[0]];
        pm = new int[n[0]];
        solution(n[0],n[1]);
    }
}
