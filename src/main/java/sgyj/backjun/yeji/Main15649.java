package sgyj.backjun.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// N과 M (1)
public class Main15649 {
    // N : 1 부터 N까지의 수
    // M : 조합의 갯수
    private static boolean[] visited;
    private static int[] data;
    private static int N,M;

    public static void solution(){
        for(int i=1; i<=N; i++){
            visited[i] = true;
            data[0] = i;
            dfs(1);
            data[0] = 0;
            visited[i] = false;
        }
    }

    public static void dfs( int L){
        if(L == M){
            for(int i=0; i<data.length; i++){
                if(data[i] != 0){
                    System.out.print(data[i] + " ");
                }
            }
            System.out.println();
        }else{
            for(int j=1; j<=N; j++){
                if(!visited[j] ){
                    visited[j] = true;
                    data[L] = j;
                    dfs(L+1);
                    data[L] = 0;
                    visited[j] = false;
                }
            }
        }
    }

    public static void main ( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String[] s = br.readLine().split( " " );
        N = Integer.parseInt( s[0] );
        M = Integer.parseInt( s[1] );
        visited = new boolean[N+1];
        data = new int[N+1];
        solution();
    }

}
