package sgyj.inflearn.seunggu.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution51 {
    /**
     * @title : 이분검색
     * @description : 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
     *                이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
     * @input : 첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
     *          두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.
     * @output : 첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split( " ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int[] arr = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).sorted().toArray();
        int lt = 0;
        int rt = n - 1;
        while (true) {
            int half = (lt + rt) / 2;
            int temp = arr[half];
            if( temp == m ) {
                return half+1;
            }
            lt = temp < m ? half : lt;
            rt = temp < m ? rt : half;
        }
    }

}
