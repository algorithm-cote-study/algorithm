package sgyj.inflearn.seunggu.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution6 {
    static int n;
    static boolean[] ch;

    public static void main ( String[] args ) {
        // 부분집합 (DFS )
        // 원소가 n 개인 집합의 부분집합 개수는 2의 n 승 이다.(공집합 포함)
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            n = Integer.parseInt( reader.readLine() );
            ch = new boolean[n+1];
            DFS(1);
        }catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static void DFS(int l) {
        if(l == n + 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i< ch.length; i++) {
                if(ch[i]) stringBuilder.append( i ).append( " " );
            }
            if(!stringBuilder.isEmpty())
                System.out.println(stringBuilder);
            return;
        }
        ch[l] = true;
        DFS(l+1);
        ch[l] = false;
        DFS(l+1);
    }
}
