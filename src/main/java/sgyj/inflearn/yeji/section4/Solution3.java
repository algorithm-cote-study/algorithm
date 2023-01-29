package sgyj.inflearn.yeji.section4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Solution3 {


    public static List<Integer> solution(int n, int k , int[] input){
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> compareValue = new HashMap<>();
        int first = 0;
        int second = first+1;
        compareValue.put(input[first],1);
        while(second < n){
            int key = input[second];
            if(compareValue.containsKey( key )){
                compareValue.put(key,compareValue.get(key)+1 );
            }else{
                compareValue.put(key,1);
            }
            if((second - first) % (k-1) == 0){
                if(first -1 >= 0 ){
                    int flag = compareValue.get( input[first - 1] );
                    if(flag - 1 == 0){
                        compareValue.remove( input[first - 1] );
                    }else{
                        compareValue.put( input[first - 1],flag-1 );
                    }
                }
                result.add( compareValue.size() );
                first++;
            }
            second++;
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int a : solution(input[0],input[1],input2)){
            System.out.print(a + " ");
        }
    }
}