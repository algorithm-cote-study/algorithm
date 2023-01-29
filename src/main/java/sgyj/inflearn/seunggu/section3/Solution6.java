package sgyj.inflearn.seunggu.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution6 {
    /**
     * @title : 최대 길이 연속부분수열
     * @description : 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
     *                만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
     *                1 1 0 0 1 1 0 1 1 0 1 1 0 1
     *                여러분이 만들 수 있는 1이 연속된 연속부분수열은
     *                1 1 1 1 1 1 1 1
     *                이며 그 길이는 8입니다.
     * @input : 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
     *          두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
     * @output : 첫 줄에 최대 길이를 출력하세요.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        String[] n = reader.readLine().split( " " );
        int length = Integer.parseInt( n[0] );
        int k = Integer.parseInt( n[1] );
        int result = 0;
        int[] array = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] zeroIndexArray = getZeroIndexArray( array );
        int startIndex = 0;
        int zeroCount = 0;
        int sumLength = 0;
        int zeroIndex = 0;
        while(startIndex < length - k) {
            for(int i=startIndex; i< length; i++) {
                if( array[i] == 0 ) {
                    if(zeroCount == k) {
                        break;
                    }
                    zeroCount++;
                }
                sumLength++;
            }
            result = Math.max( result, sumLength );
            sumLength=0;
            zeroCount = 0;
            startIndex = zeroIndexArray[zeroIndex++] + 1;
        }

        return result;
    }

    private static int[] getZeroIndexArray ( int[] array ) {
        StringBuilder stringBuilder = new StringBuilder();
        for ( int i = 0; i < array.length; i++ ) {
            if( array[i] == 0) stringBuilder.append( i ).append( " " );
        }
        return Arrays.stream( stringBuilder.toString().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
    }
}
