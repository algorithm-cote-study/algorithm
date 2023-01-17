package sgyj.inflearn.yeji.week3;

import java.util.Scanner;
import java.util.stream.IntStream;

class Solution29{

    public static int solution(int target){
        int answer = 0;
        int[] arrayInt = IntStream.rangeClosed(1,target).toArray();
        int first = 0;
        int second = 1;
        int checkValue = arrayInt[first];
        while(first < arrayInt.length - 1){
            if(second == arrayInt.length - 1){
                first++;
                second = first + 1;
                checkValue = arrayInt[first];
                continue;
            }
            if(checkValue == target){
                answer++;
                first++;
                second = first + 1;
                checkValue = arrayInt[first];
                continue;
            }
            if(checkValue < target){
                checkValue += arrayInt[second];
                second++;
            }else{
                first++;
                second = first + 1;
                checkValue = arrayInt[first];
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(solution(input));
    }
}
