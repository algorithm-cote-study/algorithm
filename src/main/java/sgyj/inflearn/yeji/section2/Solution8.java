package sgyj.inflearn.yeji.section2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution8 {

    private static int[] solution(String[] input){
        int[] result = new int[input.length];
        List<Integer> collect = Arrays.stream( input ).map( Integer::parseInt ).collect( Collectors.toList() );
        Collections.sort( collect );
        Collections.reverse( collect );
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        int grade = 1;
        for(int c : collect){
            if(!linkedHashMap.containsKey( c )){
                linkedHashMap.put( c, grade );
            }
            grade++;
        }
        for(int i =0; i<input.length; i++){
            result[i] = linkedHashMap.get( Integer.parseInt( input[i] ) );
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String[] input2 = in.nextLine().split( " " );
        int[] solution = solution( input2 );
        for ( int i : solution ) {
            System.out.print(i + " ");
        }
    }
}
