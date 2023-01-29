package sgyj.inflearn.yeji.section5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution6 {
    // 공주구하기
    public static int solution(int length, int target){
        int answer = 0;
        List<Integer> queue = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int front = 0;
        int rear = length-1;
        for(int i=1; i<=length; i++){
            queue.add( i );
        }

        int i = 1;
        while ( !queue.isEmpty()){
            if(i == target){
                result.add( queue.get( front ) );
                queue.remove( front );
                i = 1;
            }else{
                queue.add(queue.get( front ));
                queue.remove( front );
                rear++;
                i++;
            }
        }


        return result.get( result.size()-1 );
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        System.out.println(solution(input[0],input[1]));
    }
}
