package sgyj.inflearn.seunggu.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution13 {

    /**
     * @title :  큰 수 출력하기
     * @description : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     *                (첫 번째 수는 무조건 출력한다)
     * @input : 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
     * @output : 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
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
        int[] numbers = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int number = numbers[0];
        StringBuilder stringBuilder = new StringBuilder().append( number ).append( " " );
        for ( int i = 1; i < numbers.length; i++ ) {
            int num = numbers[i];
            if( num > numbers[i - 1]) {
                stringBuilder.append( num ).append( " " );
            }
        }
        return stringBuilder.toString();
    }

}
