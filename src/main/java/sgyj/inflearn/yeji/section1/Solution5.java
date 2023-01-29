package sgyj.inflearn.yeji.section1;

import java.util.Scanner;

public class Solution5 {

    //  a#b!GE*T@S
    //  S#T!EG*b@a
    // kdj#@kdjg%$#kdjgk@kd$dk
    // kdd#@kkgj%$#dkgjd@kj$dk

    public String solution(String s){
        StringBuilder exString = new StringBuilder();
        for ( char c : s.toCharArray() ) {
            if(Character.isAlphabetic( c )){
                exString.append( c );
            }
        }
        exString.reverse();
        for(int i=0; i<s.length(); i++){
            if(!Character.isAlphabetic( s.charAt( i ) )){
                exString.insert( i,s.charAt( i ) );
            }
        }

        return exString.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution5 so = new Solution5();
        System.out.println( so.solution( in.nextLine() ) );
    }
}
