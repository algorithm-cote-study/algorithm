package sgyj.inflearn.seunggu.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution22 {
    private static int[] dx = new int[]{-1, 0, 1, 0};  // x 축
    private static int[] dy = new int[]{0, 1, 0, -1};  // y 축
    /**
     * @title : 봉우리
     * @description : 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
     *                각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
     *                격자의 가장자리는 0으로 초기화 되었다고 가정한다.
     *                만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
     * @input : 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
     *          두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
     * @output : 봉우리의 개수를 출력하세요.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println( solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public static int solution ( BufferedReader reader ) throws IOException {
        int count = Integer.parseInt( reader.readLine() );
        int[][] array = new int[count][count];
        for(int i=0; i<count; i++){
            array[i] = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        }
        return getHighestCount( count, array );
    }

    private static int getHighestCount ( int count, int[][] array ) {
        int result = 0;
        for(int i=0; i < count; i++) {
            for(int j=0; j < count; j++) {
                int num = array[i][j];
                if ( isHighest( array, i, j, num, count ) ) result++;
            }
        }
        return result;
    }

    private static boolean isHighest ( int[][] array, int i, int j, int num, int count ) {
        for(int k=0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if( (x == -1 || x == count) || (y == -1 || y == count)  ) continue;
            if( array[x][y] >= num ) {
                return false;
            }
        }
        return true;
    }
}
