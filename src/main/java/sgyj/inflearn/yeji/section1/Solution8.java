package sgyj.inflearn.yeji.section1;

import java.util.Scanner;

public class Solution8 {


    public String solution(String value){
        String answer = "YES";
        StringBuilder stringBuilder = new StringBuilder();
        for(char v : value.toCharArray()){
            if(Character.isAlphabetic( v )){
                stringBuilder.append( Character.toLowerCase( v ) );
            }
        }
        StringBuilder reverseStringBuilder = new StringBuilder();
        reverseStringBuilder.append( stringBuilder );
        reverseStringBuilder.reverse();
        for(int i=0; i<stringBuilder.length(); i++){
            if(reverseStringBuilder.charAt( i ) != stringBuilder.charAt( i )){
                answer = "NO";
            }
        }

        return  answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution8 solution8 = new Solution8();
        System.out.println( solution8.solution( in.nextLine() ) );
    }
}
