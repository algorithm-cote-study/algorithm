package sgyj.inflearn.seunggu.week8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution75 {

    /**
     * @title : 조합 구하기
     * @description : 1부터 N까지 번호가 적힌 구슬이 있습니다.
     *                이중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
     * @output : 첫 번째 줄에 결과를 출력합니다.
     *           출력순서는 사전순으로 오름차순으로 출력합니다.
     */
    private static int n;
    private static int m;
    private static boolean[] visited;
    private static int[] originArr;
    private static int[] arr;
    private static StringBuilder stringBuilder;

    public static void main (String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] lines = reader.readLine().split(" ");
            n = Integer.parseInt(lines[0]);
            m = Integer.parseInt(lines[1]);
            visited = new boolean[n+1];
            originArr = new int[n];
            for(int i=0; i<n; i++) {
                originArr[i] = i+1;
            }
            arr = new int[m];
            stringBuilder = new StringBuilder();
            recursion(0);
            System.out.println(stringBuilder);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void recursion(int number) {
        if(number == m) {
            for(int x : arr) {
                stringBuilder.append(x).append(" ");
            }
            stringBuilder.append("\n");
            return;
        }

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[number] = originArr[i];
                recursion( number+1 );
                visited[i] = false;
            }
        }

    }

}
