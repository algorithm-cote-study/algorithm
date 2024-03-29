package sgyj.inflearn.seunggu.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution5 {
    /**
     * @title : 중복 확인
     * @description : 현수네 반에는 N명의 학생들이 있습니다.
     *                선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
     *                만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
     *                N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 자연수 N(5<=N<=100,000)이 주어진다.
     *          두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력된다.
     * @output : 첫 번째 줄에 D 또는 U를 출력한다.
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
        Set<Integer> integerSet = Arrays.stream( reader.readLine().split( " " ) )
                                     .mapToInt( Integer::parseInt )
                                     .boxed()
                                     .collect( Collectors.toSet() );
        if(integerSet.size() == count) {
           return "U";
        }
        return "D";
    }
}
