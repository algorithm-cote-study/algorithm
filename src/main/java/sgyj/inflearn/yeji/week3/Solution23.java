package sgyj.inflearn.yeji.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution23 {

    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int[][] input = new int[5][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                input[j][i] = scanner.nextInt();
            }
        }
        System.out.println(solution( input ));
    }

    public static int solution(int[][] input){
        int answer = Integer.MAX_VALUE;
        Set<String> resultGroupingMember = new HashSet<>();
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for ( int i = 0; i < input.length; i++ ) {
            int[] ints = input[i];
            Set<String> groupingMember = findGroupingMember( ints );
            if(!groupingMember.isEmpty()){
                resultGroupingMember.addAll( groupingMember );
            }
        }

        for(String member : resultGroupingMember){
            String[] s = member.split( " " );
            String first = s[0];
            String second = s[1];
            if(resultMap.containsKey( first )){
                resultMap.put( first, resultMap.get( first )+1 );
            }else{
                resultMap.put( first,1 );
            }

            if(resultMap.containsKey( second )){
                resultMap.put( second, resultMap.get( second )+1 );
            }else{
                resultMap.put( second, 1 );
            }
        }

        int maxCount = 0;
        if(resultMap.isEmpty()) return 1;
        for(String key : resultMap.keySet()){
            if(resultMap.get( key )>maxCount){
                maxCount = resultMap.get( key );
                answer = Integer.parseInt( key );
            }else if(resultMap.get(key) == maxCount  &&  Integer.parseInt( key ) < answer){
                answer = Integer.parseInt( key );
            }
        }
        return answer;
    }

    public static Set<String> findGroupingMember ( int[] groupingMember ){
        Set<String> resultMember = new HashSet<>();
        for ( int i = 0; i < groupingMember.length; i++ ) {
            for(int j = i+1; j< groupingMember.length; j++){
                if(groupingMember[i] == groupingMember[j]){
                    resultMember.add( (i+1)+" "+(j+1)  );
                }
            }
        }

        return resultMember;
    }
}
