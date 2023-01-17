package sgyj.inflearn.yeji.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution35{
    // k번째 큰수
    public static Set<Integer> compareList = new HashSet<>();

    public static int solution(int n, int k, int[] input){
        int i = 0;
        int pointer1 = 1;
        int pointer2 = 2;
        int m = input[i];
        while(i < n){
            if(pointer1 >= n){
                i++;
                m = input[i];
                pointer1 = i+1;
                pointer2 = pointer1+1;
                if(pointer2 > n){
                    break;
                }
                continue;
            }
            if(pointer2 >= n){
                pointer1++;
                pointer2 = pointer1+1;
                m = input[i];
                continue;
            }
            m += input[pointer1];
            m += input[pointer2];
            compareList.add(m);
            m = input[i];
            pointer2++;
        }
        List<Integer> orderCompareList = compareList.stream().sorted().collect( Collectors.toList());
        Collections.reverse(orderCompareList);
        return orderCompareList.size() < k ? -1 : orderCompareList.get( k-1 );
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.print(solution(input[0],input[1],input2));
    }
}

