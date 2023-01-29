package sgyj.inflearn.seunggu.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    /**
     * @title : 재귀함수
     * @description : 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.
     * @output : 첫째 줄에 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
            DFS(3);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution( BufferedReader reader ) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        return recursive( n, stringBuilder );
    }

    static String recursive(int n, StringBuilder stringBuilder) {
        if(n < 1) {
            return stringBuilder.toString();
        }
        stringBuilder.insert( 0, n ).insert( 1," " );
        return recursive( n-1, stringBuilder );
    }


    static void DFS(int n) {
        if(n == 0) {
            return;
        }
        DFS(n-1);                   // stack 을 이용했기 때문에 두개의 위치가 바뀌면 순서가 바뀐다. 지금은 1, 2, 3 -> 아래 줄과 위치를 바꾸면 3, 2, 1 로 출력된다.
        System.out.print(n + " ");
    }

}
