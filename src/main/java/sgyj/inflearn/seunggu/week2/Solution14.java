package sgyj.inflearn.seunggu.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution14 {

    /**
     * @description : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
     *                선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
     * @input : 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
     * @output : 선생님이 볼 수 있는 최대학생수를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            String count = reader.readLine();
            int[] array = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            System.out.println(solution( array ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private static int solution ( int[] array ) {
        int maxHeight = array[0];
        int result = 1;
        for(int i=1; i < array.length; i++) {
            if( maxHeight < array[i]) {
                result++;
                maxHeight = array[i];
            }
        }
        return result;
    }
}
