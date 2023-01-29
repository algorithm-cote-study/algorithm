package sgyj.inflearn.yeji.section7;

import java.util.Scanner;

public class Solution2 {
    // 이진수 출력 (재귀) Integer.toBinaryString();
    public static void solution( int n){
        if(n!=0){
            solution( n/2 );
            System.out.print(n%2);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        solution( n );
    }
}
