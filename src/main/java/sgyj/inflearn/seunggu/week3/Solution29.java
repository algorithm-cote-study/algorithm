package sgyj.inflearn.seunggu.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution29 {
    /**
     * @title : 연속된 자연수의 합
     * @description : N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
     *                만약 N=15이면
     *                7+8=15
     *                4+5+6=15
     *                1+2+3+4+5=15
     *                와 같이 총 3가지의 경우가 존재한다.
     * @input : 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
     * @output : 첫 줄에 총 경우수를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        int number = Integer.parseInt( reader.readLine() );
        int result = 0;
        for(int i=1; i<number; i++) {
            int sum = i;
            for(int j=i+1; j <number; j++) {
                sum += j;
                if(sum > number) {
                    break;
                }
                if(sum == number) {
                    result++;
                }
            }
        }
        return result;
    }
}
