package sgyj.inflearn.yeji.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    // 버블정렬
    public static void swap(int[] input,int findMinIndex, int index){
        int tmp = input[index];
        input[index] = input[findMinIndex];
        input[findMinIndex] = tmp;
    }

    public static int[] solution(int n, int[] input){
        int t = 0;
        while(t<n-1){
            int last = 0;
            for(int j=n-1; j>t; j--){
                if(input[j-1]>input[j]){
                    swap(input,j-1,j);
                }
                last = j;
            }
            t = last;
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
