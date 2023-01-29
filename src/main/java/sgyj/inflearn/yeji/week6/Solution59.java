package sgyj.inflearn.yeji.week6;

import java.util.Scanner;

public class Solution59 {
    // 부분집합 구하기
    public static int n;
    public static int[] h;

    public static void DFS(int L){
        if(L==n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(h[i]==1) tmp+=(i + " ");
            }
            if ( tmp.length() > 0 ) {System.out.println(tmp);}
        }else{
            h[L] = 1;
            DFS(L+1);
            h[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        n = sc.nextInt();
        h = new int[n+1];
        DFS(1);
    }
}
