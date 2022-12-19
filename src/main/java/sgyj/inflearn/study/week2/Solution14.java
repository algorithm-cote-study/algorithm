package sgyj.inflearn.study.week2;

import java.util.Scanner;

public class Solution14 {

    public static int solution(int n, int[] arr){
        int answer = 1, max=arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > max) {
                answer++;
                max=arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        int[] ints = new int[input1];
        for(int i=0; i<input1; i++){
            ints[i] = in.nextInt();
        }
        System.out.print(solution(input1, ints));
    }

}
