package sgyj.inflearn.study.week2;

import java.util.Scanner;

public class Solution12 {
    /*
    * Integer.parseInt();
    * */
    public static String solution(int n , String s){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = s.substring( 0,7 ).replace( '#','1' ).replace( '*','0' );
            int num = Integer.parseInt( tmp,2 );
            answer+=(char)num;
            s=s.substring( 7 );
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        sgyj.inflearn.yeji.week2.Solution12 solution12 = new sgyj.inflearn.yeji.week2.Solution12();
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        System.out.println( solution12.solution( n, s ) );
    }
}
