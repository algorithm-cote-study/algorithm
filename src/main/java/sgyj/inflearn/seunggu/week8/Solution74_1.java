package sgyj.inflearn.seunggu.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution74_1 {

    private static int n;
    private static int m;
    private static boolean[] visited;
    private static int[] compareArr;
    private static int[] arr;
    private static int[] initArr;

    private static String answer;

    private static boolean flag = false;

    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            String[] lines = reader.readLine().split(" ");
            n = Integer.parseInt(lines[0]);
            m = Integer.parseInt(lines[1]);
            visited = new boolean[n+1];
            arr = new int[n];
            initArr = new int[n];
            for(int i=0; i<n; i++) {
                initArr[i] = i+1;
            }
            setCompareArr();
            DFS( 0 );
            System.out.println(answer);
        }catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private static final int[][] memo = new int[100][100];
    private static void setCompareArr() {
        compareArr = new int[n];
        for(int i=0; i<n; i++) {
            compareArr[i] = recursion( n-1, i );
        }
    }
    public static int recursion(int n, int r) {
        if(memo[n][r] != 0) return memo[n][r];
        if(n == r || r == 0) return 1;
        memo[n][r] = recursion( n-1, r-1 ) + recursion( n-1, r );
        return memo[n][r];
    }

    public static void DFS(int l) {
        if(flag) return;
        if(l == n) {
            int sum = 0;
            for(int i=0; i<n; i++) {
                sum += (compareArr[i] * arr[i] );
            }
            if(sum == m) {
                StringBuilder stringBuilder = new StringBuilder();
                for(int i=0; i<n; i++) {
                    stringBuilder.append( arr[i] ).append(" ");
                }
                answer = stringBuilder.toString();
                flag = true;
            }
            return;
        }

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[l] = initArr[i];
                DFS(l+1);
                visited[i] = false;
            }
        }
    }

}
