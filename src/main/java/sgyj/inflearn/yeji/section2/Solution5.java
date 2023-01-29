package sgyj.inflearn.yeji.section2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution5 {

    /*
    * @description
    * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
    *
    * @input
    * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
    * ex) 20
    * @output
    * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
    * ex) 8
    * */
    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        int answer = -1;
        int[] checkPrime = IntStream.rangeClosed( 0,input1 ).toArray();
        for(int i=2; i<=input1; i++){
            for(int j = i+i; j<=input1; j+=i){
                checkPrime[j] = 0;
            }
        }
        for(int prime : checkPrime){
            if(prime != 0) answer++;
        }

        System.out.println( answer );
    }
}
