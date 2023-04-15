package sgyj.backjun.yeji;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 부분수열의 합
public class Main1182 {

    private static int[] data;
    private static int target;
    private static int answer;
    private static int N;

    public static void main ( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        int[] input = Arrays.stream(br.readLine().split( " " )).mapToInt( Integer::parseInt ).toArray();
        data = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        target = input[1];
        N = input[0];

        dfs(0,0);

        System.out.println(target == 0 ? answer - 1 : answer);
    }

    private static void dfs(int dep, int sum) {
        if (dep == N) {
            if (sum == target)
                answer++;
            return;
        }

        dfs(dep + 1, sum + data[dep]);
        dfs(dep + 1, sum);
    }



}
