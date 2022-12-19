package sgyj.inflearn.seunggu.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution27 {
    /**
     * @title : 최대 매출
     * @description : 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
     *                만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
     *                12 1511 20 2510 20 19 13 15
     *                연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
     *                여러분이 현수를 도와주세요.
     * @input : 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
     *          두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
     * @output : 첫 줄에 최대 매출액을 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        String[] word = reader.readLine().split( " " );
        int days = Integer.parseInt( word[0] );
        int consecutive = Integer.parseInt( word[1] );
        int[] array = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int lt = 0;
        int rt = consecutive;
        int max = Integer.MIN_VALUE;
        while(rt != days) {
            int sum = 0;
            for(int i=lt; i < rt; i++) {
                sum += array[i];
            }
            max = Math.max( max, sum );
            lt++;
            rt++;
        }
        return max;
    }
}
