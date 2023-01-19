package sgyj.inflearn.yeji.week5;

import java.util.Arrays;
import java.util.Scanner;

public class Solution44 {
    // 선택 정렬
    public static void swap(int[] input,int findMinIndex, int index){
        int tmp = input[index];
        input[index] = input[findMinIndex];
        input[findMinIndex] = tmp;
    }

    public static int[] solution(int n, int[] input){
        int index = 0;
        while(index < n){
            int min = Integer.MAX_VALUE;
            int findMinIndex = -1;
            for(int i = index; i<n; i++){
                if(input[i]<min){
                    min = input[i];
                    findMinIndex = i;
                }
            }
            swap(input,findMinIndex,index);
            index++;
        }
        return input;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        for(int i : solution( n,input )){
            System.out.print(i+" ");
        }
    }


}
