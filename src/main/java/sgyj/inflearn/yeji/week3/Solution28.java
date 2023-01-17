package sgyj.inflearn.yeji.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution28 {

    public static int solution(int n, int m, int[] input){
        int i = 0, first = i, second = i+1, answer = 0, checkValue = input[first];

        while(first < n - 1){
            if(second > n-1){
                first++;
                second = first + 1;
                checkValue = input[first];
                continue;
            }
            if(checkValue == m){
                answer++;
                first++;
                second = first + 1;
                checkValue = input[first];
                continue;
            }
            if(checkValue < m){
                checkValue += input[second];
                second++;
            }else{
                first++;
                second = first + 1;
                checkValue = input[first];
            }
        }
        first = n-1; second = n-2; checkValue = input[first];
        while ( checkValue <= m ){
            if(checkValue == m){
                answer++;
                break;
            }
            checkValue += input[second];
            second--;
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] input1 = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(input1[0],input1[1],input2));
    }
}
