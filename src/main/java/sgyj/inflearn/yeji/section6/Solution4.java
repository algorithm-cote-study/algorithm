package sgyj.inflearn.yeji.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    // Least Recently Used
    public static void moveCache(int[] input, int cache){
        int first = input[0];
        for(int i = 1; i<input.length; i++){
            int next = input[i];
            input[i] = first;
            first = next;
        }
        input[0] = cache;
    }

    public static void restoreCache(int[] input, int targetIndex, int cache){
        int first = input[0];
        for(int i=1; i<=targetIndex; i++){
            int next = input[i];
            input[i] = first;
            first = next;
        }
        input[0] = cache;
    }

    public static int[] solution(int n, int[] input){
        int[] result = new int[n];
        int target=0;
        int i = 0;
        while ( i< input.length ){
            // 해야할 작업이 캐시에 없음
            if(target == n-1){
                target=0;
                moveCache(result,input[i]);
                i++;
                continue;
            }
            if(result[target]==input[i]){
                restoreCache(result,target,result[target]);
                i++;
                target=0;
            }
            if(result[target]!=input[i]){
                target++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] input1 =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        for(int i : solution(input1[0],input2)){
            System.out.print(i+" ");
        }
    }
}
