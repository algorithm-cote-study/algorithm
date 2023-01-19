package sgyj.inflearn.seunggu.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Solution50 {

    /**
     * @title : 좌표 정렬
     * @description : N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
     *                정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
     * @input : 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
     *          두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
     * @output : N개의 좌표를 정렬하여 출력하세요.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int count = Integer.parseInt( reader.readLine());
        int[][] arr = new int[count][2];
        for(int i=0; i < count; i++) {
            arr[i] = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        }
        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare( a[1], b[1] );
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for ( int[] ints : arr ) {
            stringBuilder.append( ints[0] ).append( " " ).append( ints[1] ).append( "\n" );
        }
        return stringBuilder.toString();
    }

}
