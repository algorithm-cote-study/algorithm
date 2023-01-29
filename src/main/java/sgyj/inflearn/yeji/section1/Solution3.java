package sgyj.inflearn.yeji.section1;

import java.util.Scanner;

public class Solution3 {

    /*
     * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     * 문장속의 각 단어는 공백으로 구분됩니다.
     * it is time to study
     * */
    public String solution(String s){
        String answer = "";
        String[] splitedString = s.split( " " );

        for ( String s1 : splitedString ) {
            if(answer.length() < s1.length()){
                answer = s1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution3 solution3 = new Solution3();
        System.out.println( solution3.solution( in.nextLine() ) );
    }
}
