package sgyj.inflearn.seunggu.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution6 {

    /**
     * @title: 뒤집은 소수
     * @description : N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
     *                예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
     *                첫 자리부터의 연속된 0은 무시한다.
     * @input : 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
     *          각 자연수의 크기는 100,000를 넘지 않는다.
     * @output : 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        reader.readLine();
        String word = reader.readLine();
        int[] array = Arrays.stream( word.split( " " ) )
            .map( s -> new StringBuilder( s ).reverse().toString() )
            .mapToInt( Integer::parseInt )
            .toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for ( int number : array ) {
            if( number > 1 && isPrime( number )) {
                stringBuilder.append( number ).append( " " );
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isPrime ( int number ) {
        for(int i=2; i < number; i++) {
            if( number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
