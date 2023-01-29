package sgyj.inflearn.yeji.section1;

import java.util.Scanner;

public class Solution1 {


    /*
     * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
     * Computercooler
     * c
     * */
    public int solution(String s, String s1){
        int answer = 0;
        for ( char c : s.toCharArray() ) {
            if(Character.toString( c ).equalsIgnoreCase( s1 )) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        String s = in.nextLine();
        String s1 = in.nextLine();
        Solution1 solution1 = new Solution1();
        System.out.println( solution1.solution(s,s1) );
    }
}
