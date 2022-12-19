package sgyj.inflearn.study.week2;

import java.util.Scanner;

public class Solution11 {

    public String solution(String s){
        String answer="";
        s = s+ " ";
        int cnt = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt( i ) == s.charAt( i+1 )) cnt++;
            else{
                answer += s.charAt( i );
                if(cnt > 1) answer+= String.valueOf( cnt );
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        sgyj.inflearn.yeji.week2.Solution11 solution11 = new sgyj.inflearn.yeji.week2.Solution11();
        System.out.println( solution11.solution( in.nextLine() ) );

    }
}
