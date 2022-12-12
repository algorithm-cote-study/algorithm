package sgyj.inflearn.yeji.week1;

import java.util.Scanner;

public class Solution2 {

    /*
     * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
     * StuDY
     * */
    public String solution(String s){
        StringBuilder answer = new StringBuilder();
        for ( char c : s.toCharArray() ) {
            if(Character.isUpperCase( c )){
                answer.append( Character.toLowerCase( c ) );
            }else{
                answer.append( Character.toUpperCase( c ) );
            }
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution2 solution2 = new Solution2();
        System.out.println( solution2.solution( in.nextLine() ) );
    }
}
