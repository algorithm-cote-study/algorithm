package sgyj.inflearn.yeji.week1;

import java.util.Scanner;

public class Solution4 {
    /*
    * 3
    *good
    *Time
    `   *Big
    * */
    public String solution(String s){
        StringBuilder answer = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            answer.append( s.charAt( i ) );
        }

        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        Solution4 solution4 = new Solution4();
        for(int i=1; i<=input1; i++){
            System.out.println(solution4.solution(in.nextLine()) );
        }
    }
}
