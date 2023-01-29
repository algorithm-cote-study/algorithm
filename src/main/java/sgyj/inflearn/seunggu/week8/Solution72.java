package sgyj.inflearn.seunggu.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution72 {

    private static int n;
    private static int m;
    private static boolean[] visited;
    private static int[] arr;
    private static int[] temp;
    private static StringBuilder stringBuilder;
    /**
     * @title : 순열 구하기
     * @description : 10이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합 니다.
     * @input : 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
     *          두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
     * @output : 첫 번째 줄에 결과를 출력합니다.
     *           출력순서는 사전순으로 오름차순으로 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            String[] lines = reader.readLine().split(" ");
            n = Integer.parseInt(lines[0]);
            m = Integer.parseInt(lines[1]);
            visited = new boolean[n];
            arr = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
            temp = new int[m];
            stringBuilder = new StringBuilder();
            recursion( 0 );
            System.out.println(stringBuilder);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public static void recursion(int number) {
        if(number == m) {
            for(int x : temp) {
                stringBuilder.append(x).append( " " );
            }
            stringBuilder.append( "\n" );
            return;
        }
        for(int i=0; i<n; i++) {
            if( !visited[i] ) {
                visited[i] = true;
                temp[number] = arr[i];
                recursion( number+1 );
                visited[i] = false;
            }
        }

    }

}
