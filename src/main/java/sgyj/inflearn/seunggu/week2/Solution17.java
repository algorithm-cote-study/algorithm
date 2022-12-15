package sgyj.inflearn.seunggu.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution17 {

    /**
     * @description : 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
     *                만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     * @input : 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
     * @output : 첫 줄에 소수의 개수를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            int number = Integer.parseInt( reader.readLine() );
            System.out.println(solution( number ));

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private static int solution(int number) {
        boolean[] memory = new boolean[number+1];
        memory[0] = memory[1] = true;
        for(int i=2; i*i <= number; i++) {
            if(!memory[i]) {
                for(int j=i*i; j <= number; j+=i) {
                    memory[j] = true;
                }
            }
        }
        int result = 0;
        for(int i=1; i<= number; i++) {
            if(!memory[i]) result++;
        }
        return result;
    }

}
