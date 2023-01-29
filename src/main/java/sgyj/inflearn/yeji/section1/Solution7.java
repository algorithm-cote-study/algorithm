package sgyj.inflearn.yeji.section1;

import java.util.Scanner;

public class Solution7 {
    // gooG
    public String solution(String value){
        String answer = "YES";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( value );
        stringBuilder.reverse();

        for(int i=0; i<value.length(); i++){
            char c = Character.toLowerCase( stringBuilder.charAt( i ) );
            char t = Character.toLowerCase( value.charAt( i ) );
            if(c != t){
                answer = "NO";
            }
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution7 solution7 = new Solution7();
        System.out.println( "so = " + solution7.solution( in.next() ) );
    }
}
