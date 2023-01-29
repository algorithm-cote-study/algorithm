package sgyj.inflearn.yeji.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution6 {
    //  중복제거
    // ksekkset
    public String solution(String value){
        StringBuilder answer = new StringBuilder();
        List<Character> values = new ArrayList<>();
        for(char v : value.toCharArray()){
            values.add( v );
        }
        List<Character> collect = values.stream().distinct().collect( Collectors.toList());
        for ( Character c : collect ) {
            answer.append( c );
        }

        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution6 solution6 = new Solution6();
        System.out.println( solution6.solution( in.next() ) );
    }
}
