package sgyj.inflearn.seunggu.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12 {
    static int n;
    static int answer = 0;
    static List<List<Integer>> graph;
    static boolean[] checked;
    /**
     * @title 경로 탐색(인접 리스트 )
     * @description 방향 그래프가 주어지면 1 번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
     * @input 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
     * @output 총 가지수를 출력한다.
     */
    public static void main ( String[] args ) {

        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            solution( reader );

        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }

    static int solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split( " " );
        n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        checked = new boolean[n+1];
        graph = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++) {
            graph.add( new ArrayList<>(n+1) );
        }
        checked = new boolean[n+1];
        for(int i=0; i<m; i++) {
            int[] ints = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            graph.get( ints[0] ).add( ints[1] );
        }
        checked[1] = true;
        recursion( 1 );
        return answer;
    }

    static void recursion(int number) {
        if(number == n) {
            answer++;
            return;
        }
        for(int nv : graph.get( number )) {
            if(!checked[nv] ) {
                checked[nv] = true;
                recursion( nv );
                checked[nv] = false;
            }
        }
    }

}
