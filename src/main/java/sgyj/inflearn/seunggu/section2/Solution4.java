package sgyj.inflearn.seunggu.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
    static int[] memory = new int[1001];
    /**
     * @title : 피보나치 수열
     * @description : 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     *                2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
     * @input : 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
     * @output : 첫 줄에 피보나치 수열을 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int count = Integer.parseInt( reader.readLine() );
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1; i<=count; i++) {
            stringBuilder.append( fibonacci( i ) ).append( " " );
        }
        return stringBuilder.toString();
    }

    public static int fibonacci ( int n) {
        if(memory[n] != 0) {
            return memory[n];
        }
        if(n <= 2) {
            memory[n] = 1;
            return 1;
        }
        memory[n] = fibonacci( n - 1 ) + fibonacci( n - 2 );
        return memory[n];
    }
}
