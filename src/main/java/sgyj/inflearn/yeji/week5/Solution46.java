package sgyj.inflearn.yeji.week5;

import java.util.Arrays;
import java.util.Scanner;

public class Solution46 {
    // 삽입정렬
    public static void swap(int[] input,int minIndex, int index){
        int tmp = input[minIndex];
        input[minIndex] = input[index];
        input[index] = tmp;
    }

    public static int[] solution(int n, int[] input){
        int k = 1;
        while(k<n){
            for(int i=k; i>0; i--){
                if(input[i-1]>input[i]){
                    swap(input,i-1,i);
                }
            }
            k++;
        }
        return input;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        for(int i : solution(n,input)) {
            System.out.print(i +  " ");
        }
    }
}
