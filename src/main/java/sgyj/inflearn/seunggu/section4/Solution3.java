package sgyj.inflearn.seunggu.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution3 {

    /**
     * @title : 매출액의 종류
     * @description : 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
     *                각 구간별로 구하라고 했습니다.
     *                만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
     *                20 12 20 10 23 17 10
     *                각 연속 4일간의 구간의 매출종류는
     *                첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
     *                두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
     *                세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
     *                네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
     *                N 일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
     *                매출액의 종류를 출력하는 프로그램을 작성하세요.
     * @input : 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
     *          두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
     * @output : 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String[] words = reader.readLine().split( " " );
        int repeat = Integer.parseInt( words[1] );
        int size = Integer.parseInt( words[0] );
        int[] array = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< repeat; i++) {
            map.put( array[i], map.getOrDefault( array[i], 0 ) + 1 );
        }
        stringBuilder.append( map.size() ).append( " " );

        for(int i=0; i< size-repeat; i++) {
            int number = map.getOrDefault( array[i], 0 );
            if(number == 1) {
                map.remove( array[i] );
            } else {
                map.put( array[i], number -1 );
            }
            map.put( array[i+repeat], map.getOrDefault( array[i+repeat], 0 ) + 1 );
            stringBuilder.append( map.size() ).append( " " );
        }
        return stringBuilder.toString();
    }

    static String solution_fail(BufferedReader reader) throws IOException {
        String[] words = reader.readLine().split( " " );
        int repeat = Integer.parseInt( words[1] );
        int[] array = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int lt = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(lt + repeat <= array.length) {
            Set<Integer> set = new HashSet<>();
            for(int i=lt; i<lt+repeat; i++) {
                set.add( array[i] );
            }
            stringBuilder.append( set.size() ).append( " " );
            lt++;
        }

        return stringBuilder.toString();
    }

}
