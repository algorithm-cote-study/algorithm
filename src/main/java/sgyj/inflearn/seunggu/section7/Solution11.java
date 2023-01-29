package sgyj.inflearn.seunggu.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution11 {
    static int n;
    static int answer = 0;
    static boolean[][] graph;
    static boolean[] checked;
    /**
     * @title 그래프와 인접행렬
     * @description 방향 그래프가 주어지면 1 번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
     * @input 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
     * @output 총 가지수를 출력한다.
     */
    public static void main ( String[] args ) {

        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            solution( reader );
            System.out.println(answer);
        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

    static void solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split( " " );
        n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        graph = new boolean[n+1][n+1];
        checked = new boolean[n+1];
        for(int i=0; i<m; i++) {
            lines = reader.readLine().split( " " );
            graph[Integer.parseInt( lines[0] )][Integer.parseInt( lines[1] )] = true;
        }
        checked[1] = true;
        recursion( 1 );
    }

    static void recursion(int number) {
        if(number == n) {
            answer++;
            return;
        }
        for(int i=1; i<= n; i++) {
            if(graph[number][i] && !checked[i]) {
                checked[i] = true;
                recursion( i );
                checked[i] = false;
            }
        }
    }

}
