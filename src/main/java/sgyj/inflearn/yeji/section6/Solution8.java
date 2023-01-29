package sgyj.inflearn.yeji.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8 {

    public static int solution(int index, int target, int[] input){
        int answer = -1;
        Arrays.sort(input);
        int first = 0;
        int last = input.length-1;
        int middle;
        while(answer == -1 && first<=last){
            middle = (first+last)/2;
            if(input[middle]==target){
                answer = middle+1;
            }
            if(input[middle]>target){
                last = middle;
            }else{
                first = middle;
            }
        }



        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(input[0],input[1],input2));
    }
}
