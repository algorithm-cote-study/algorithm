package sgyj.programmers.yeji.section4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution42746 {
    public static String solution(int[] numbers) {
        String answer =  Arrays.stream( numbers ).mapToObj( Integer::toString ).sorted( ( o1, o2 ) -> ( o2 + o1).compareTo( o1 + o2 ) ).collect( Collectors.joining());
        return answer.startsWith("0") ? String.valueOf(Integer.parseInt(answer)) : answer;
    }

    public static void main ( String[] args ) {
        int[] numbers = {0,0,0,0,0};
        System.out.println(solution( numbers ));
    }
}
