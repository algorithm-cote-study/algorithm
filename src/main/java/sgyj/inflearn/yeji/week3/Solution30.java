package sgyj.inflearn.yeji.week3;

import java.util.Scanner;
import java.util.Arrays;

class Solution30{

    public static int solution(int n ,int k , int[] input){
        int answer = 0;
        int compareMax = 0;
        int i = 0, pointer = 0, check = 0;
        while(i < n){
            if(pointer == n){
                if(answer < compareMax){
                    answer = compareMax;
                }
                compareMax = 0;
                i++;
                pointer = i;
                continue;
            }
            if(k == check && input[pointer] == 0){
                if(answer < compareMax){
                    answer = compareMax;
                }
                check = 0;compareMax = 0;
                i++;
                pointer = i;
            }
            if(input[pointer] == 1){
                compareMax++;
            }else{
                compareMax++;
                check++;
            }
            pointer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(input[0],input[1],input2));
    }
}