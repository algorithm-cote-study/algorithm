package sgyj.inflearn.yeji.week6;

import java.util.Scanner;

public class Solution56 {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        System.out.println(solution(n,1));
    }

    private static int solution ( int n, int answer ) {
        if(n>0){
            return solution( n-1,answer*n );
        }
        return answer;
    }
}
