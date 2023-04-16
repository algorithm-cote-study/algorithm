package sgyj.programmers.yeji.section4;

import java.util.Arrays;

public class Solution42747 {
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort( citations );
        for(int i=0;i<citations.length; i++){
            int compare = 1;
            for(int j= i+1; j<citations.length; j++){
                if(citations[j]>=citations[i]){
                    compare+=1;
                }
            }
            if(compare>=citations[i]) answer = Math.max( answer, citations[i] );
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}
