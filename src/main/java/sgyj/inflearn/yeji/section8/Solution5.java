package sgyj.inflearn.yeji.section8;

import java.util.*;

public class Solution5 {
    // 순열 구하기

    public static int[] pm,ch,arr;
    static int n,m;
    public static void DFS(int L){
        if(L==m){
            for ( int x : pm ) {System.out.print(x + " ");}
            System.out.println();
        } else {
            for(int i=0; i<n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    pm[L]=arr[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int[] input1 = Arrays.stream( sc.nextLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        n = input1[0];
        m = input1[1];
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ch = new int[n]; // checked array
        pm = new int[m]; // permutation array

        DFS(0);
    }

}
