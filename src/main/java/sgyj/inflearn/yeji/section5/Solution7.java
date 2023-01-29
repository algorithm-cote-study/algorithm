package sgyj.inflearn.yeji.section5;

import java.util.Scanner;

public class Solution7 {
    // 교육과정설계
    public static String solution(String target, String subjcet){
        int index=0;
        int[] result = new int[target.length()];
        int compare = 0;
        while(index<target.length()){
            if(compare>=subjcet.length()){
                compare = 0;
            }
            if(!subjcet.contains(String.valueOf( target.charAt( index ) ))){
                return "NO";
            }
            if(target.charAt(index)==subjcet.charAt(compare)){
                result[index] = compare;
                index++;
            }
            compare++;
        }
        int min = result[0];
        for(int i : result){
            if(min>i) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        String target = sc.nextLine();
        String input = sc.nextLine();
        System.out.println(solution(target,input));
    }
}
