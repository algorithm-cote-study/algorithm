package sgyj.inflearn.seunggu.section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
    /**
     * @title : 피보나치 수열
     * @description : 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     *                입력은 피보나치 수의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13 을 출력하면 된다.
     * @input : 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
     * @output : 첫 줄에 피보나치 수열을 출력합니다.
     */
    private static int[] array = new int[1024];
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            fibo( Integer.parseInt( reader.readLine() ) );
            for(int i=1; i<array.length; i++) {
                if(array[i] == 0) return;
                System.out.print(array[i] + " ");
            }
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public static int fibo ( int n) {
        if(n == 1 || n == 2) {
            array[n] = 1;
            return 1;
        }

        if(array[n] != 0) return array[n];
        array[n] = fibo( n - 1 ) + fibo( n - 2 );
        return array[n];
    }

    static int DFS(int n) {
        if(n ==1 || n == 2) {
            return 1;
        }
        return DFS(n-1) + DFS( n -2 );
    }
}
