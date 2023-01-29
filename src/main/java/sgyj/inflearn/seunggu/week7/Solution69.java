package sgyj.inflearn.seunggu.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution69 {

    static int n;
    static int m;

    static int [][] array;

    static boolean[] visited;
    static int max = Integer.MIN_VALUE;

    /**
     * @title : 최대점수 구하기(DFS)
     * @description : 이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
     *                각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
     *                제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
     *                (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
     * @input : 첫 번째 줄에 문제의 개수N(1<=N<=20)과 제한 시간 M(10<=M<=300)이 주어집니다.
     *          두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는데 걸리는 시간이 주어집니다.
     * @output : 첫 번째 줄에 제한 시간안에 얻을 수 있는 최대 점수를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            String[] lines = reader.readLine().split( " " );
            n = Integer.parseInt(lines[0]);
            m = Integer.parseInt(lines[1]);
            array = new int[n][2];
            visited = new boolean[n+1];
            for(int i=0 ;i < n; i++) {
                array[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            BFS(0);
            System.out.println(max);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static void BFS(int number) {
        if(number == n) {
            int sumTime = 0;
            int sumScore = 0;
            for(int i=0; i<n; i++) {
                if(visited[i]) {
                    sumScore += array[i][0];
                    sumTime += array[i][1];
                }
            }
            if(sumTime <= m) {
                max = Math.max(sumScore, max);
            }
            return;
        }
        visited[number] =true;
        BFS(number+1);
        visited[number] = false;
        BFS(number+1);
    }
}
