package sgyj.inflearn.seunggu.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution28 {
    /**
     * @title :연속 부분수열
     * @description : N개의 수로 이루어진 수열이 주어집니다.
     *                이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
     *                만약 N=8, M=6이고 수열이 다음과 같다면
     *                1 2 1 3 1 1 1 2
     *                합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
     * @input : 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
     *          수열의 원소값은 1,000을 넘지 않는 자연수이다.
     * @output : 첫째 줄에 경우의 수를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        String[] words = reader.readLine().split( " " );
        int count = Integer.parseInt( words[0] );
        int consecutive = Integer.parseInt( words[1] );
        int[] array = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int result = 0;
        for ( int i = 0; i < count; i++ ) {
            int sum = 0;
            int start = i;
            while(sum < consecutive && start != count) {
                sum += array[start++];
                if(sum == consecutive) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
