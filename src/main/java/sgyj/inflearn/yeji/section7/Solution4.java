package sgyj.inflearn.yeji.section7;

import java.util.Scanner;

public class Solution4 {
    // 피보나치
    public static void fibonacci(int[] answer,int x, int y){
        if(y < answer.length-1){
            answer[y+1] = answer[x]+answer[y];
            fibonacci(answer,x+1,y+1);
        }

    }

    public static int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        fibonacci(answer,0,1);
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        for(int i : solution(n)) System.out.print(i + " ");
    }
}
