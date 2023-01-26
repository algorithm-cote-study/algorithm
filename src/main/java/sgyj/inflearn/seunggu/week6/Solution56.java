package sgyj.inflearn.seunggu.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution56 {
    /**
     * @title : 팩토리얼
     * @description : 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
     *                예를 들어 5! = 5*4*3*2*1=120입니다.
     * @input : 첫 번째 줄에 자연수 N(1<=n<=100)이 주어집니다.
     * @output : 첫 줄에 N팩토리얼 값을 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        int number = Integer.parseInt(reader.readLine());
        return factorial( number, 1);
    }

    static int factorial(int n, int sum) {
        if(n == 0) {
            return sum;
        }
        sum *= n;
        return factorial( n-1, sum );
    }

    static int DFS(int n) {
        if(n == 1) return 1;
        return n * DFS(n-1);
    }

}
