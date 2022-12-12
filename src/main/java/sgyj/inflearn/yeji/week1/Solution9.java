package sgyj.inflearn.yeji.week1;

import java.util.Scanner;

public class Solution9 {
    // g0en2T0s8eSoft
    public int solution(String value){
        StringBuilder stringBuilder = new StringBuilder();
        for(char v : value.toCharArray()){
            if(Character.isDigit( v )){
                stringBuilder.append( v );
            }
        }
        return Integer.parseInt( stringBuilder.toString() );
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution9 solution9 = new Solution9();
        System.out.println( "solution9 = " + solution9.solution( in.nextLine() ) );
    }
}
