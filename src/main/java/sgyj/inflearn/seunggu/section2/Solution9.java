package sgyj.inflearn.seunggu.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution9 {

    /**
     * @title : 격자판 최대합
     * @description : 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
     *                N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
     * @input : 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
     *          두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
     * @output : 최대합을 출력합니다.
     */

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        int count = Integer.parseInt( reader.readLine() );
        int[][] array = new int[count][count];
        for ( int i = 0; i < count; i++ ) {
            array[i] = Arrays.stream( reader.readLine().split( " " )).mapToInt( Integer::parseInt ).toArray();
        }
        return getMaxNumber( count, array );
    }

    private static int getMaxNumber ( int count, int[][] array ) {
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < count; i++ ) {
            max = Math.max( max, Arrays.stream( array[i] ).sum() );  // 가로 합 먼저 구하기
        }

        int x = 0;  // 세로
        int y = 0;  // 왼쪽 대각선
        int z = 0;  // 오른쪽 대각선
        for(int i=0; i < count; i++) {
            for(int j=0; j < count; j++) {
                x += array[j][i];
            }
            max = Math.max( max, x );
            x = 0;
            y += array[i][i];
            z += array[i][count - 1 - i];
        }
        max = Math.max( max, y );
        max = Math.max( max, z );
        return max;
    }

}
