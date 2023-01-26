package sgyj.inflearn.seunggu.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution55 {
    /**
     * @title : 재귀함수를 이용한 이진수 출력
     * @description : 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용해서 출력해야 합니다.
     * @input : 첫 번째 줄에 정수 N(1<=N<=1,000)이 주어집니다.
     * @output : 첫째 줄에 이진수를 출력하세요.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
            DFS(11);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution( BufferedReader reader ) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        // 2 로 나누어서 나머지를 구하면 2진수가 된다.
        return recursive( n, stringBuilder );
    }

    static String recursive(int n, StringBuilder stringBuilder) {
        if(n < 1) {
            return stringBuilder.toString();
        }
        stringBuilder.insert( 0,n % 2 );
        return recursive( n / 2, stringBuilder );
    }


    static void DFS(int n) {
        if(n == 0) {
            return;
        }
        DFS(n/2);                   // stack 을 이용했기 때문에 두개의 위치가 바뀌면 순서가 바뀐다. 지금은 1, 2, 3 -> 아래 줄과 위치를 바꾸면 3, 2, 1 로 출력된다.
        System.out.print(n % 2);
    }

}
