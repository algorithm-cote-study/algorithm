package sgyj.inflearn.seunggu.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution8 {
    /**
     * @title : 등수구하기
     * @description : N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
     *                같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
     *                즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
     * @input : 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
     * @output : 입력된 순서대로 등수를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        reader.readLine();
        String readLine = reader.readLine();
        int[] array = Arrays.stream( readLine.split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> sortedArray = Arrays.stream( array ).boxed().sorted( Comparator.reverseOrder() ).toList();
        int grade = 1;
        for ( int number : sortedArray ) {
            int num = map.getOrDefault( number, 0 );
            if(num == 0) {
                map.put( number, grade );
            }
            grade++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for ( int number : array ) {
            stringBuilder.append( map.get( number ) ).append( " " );
        }
        return stringBuilder.toString();
    }

}
