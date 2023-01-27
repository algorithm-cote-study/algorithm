package sgyj.inflearn.yeji.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution67 {
    static String answer = "NO";
    static int n, totalSum = 0;
    static boolean flag = false;
    public static void DFS(int L, int sum, int[] arr){
        if(flag) return;
        if(sum>totalSum/2) return;
        if(L==n){
            if((totalSum-sum) == sum){
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        n = sc.nextInt();
        sc.nextLine();
        int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        totalSum = Arrays.stream( input ).sum();
        DFS(0,0,input);
        System.out.println(answer);
    }
}
