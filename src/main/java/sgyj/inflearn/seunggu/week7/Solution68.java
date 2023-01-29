package sgyj.inflearn.seunggu.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution68 {

    private static boolean[] visited;
    private static final int[] array = new int[10001];
    private static int[] baduks;
    private static int max = Integer.MIN_VALUE;
    private static int n;
    private static int c;
    /**
     * @title : 바둑이 승차(DFS)
     * @description : 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
     *                철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
     *                N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.
     *          둘째 줄부터 N마리 바둑이의 무게가 주어진다.
     * @output : 첫 번째 줄에 가장 무거운 무게를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            String[] lines = reader.readLine().split( " " );
            c = Integer.parseInt( lines[0] );
            n = Integer.parseInt( lines[1] );
            baduks = new int[n];
            visited = new boolean[n];
            for(int i=0; i<n; i++) {
                baduks[i] = Integer.parseInt(reader.readLine());
            }
            DFS(0);
            System.out.println(max);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static void DFS(int number) {
        if(number == n) {
            int sum = 0;
            for(int i=0; i<visited.length; i++) {
                if(visited[i] ) sum += baduks[i];
            }
            if( sum <= c) {
                max = Math.max(sum, max);
            }
            return;
        }
        visited[number] = true;
        DFS(number+1);
        visited[number] = false;
        DFS(number+1);
    }

}
