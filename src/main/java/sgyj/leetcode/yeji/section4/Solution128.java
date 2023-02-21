package sgyj.leetcode.yeji.section4;

import java.util.HashMap;
import java.util.Map;

public class Solution128 {

    private static int longestConsecutive(int[] nums) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put( n,1 );
        }
        for(int n : nums){
            if(map.get( n-1 )==null){
                int target = n+1;
                int compare = 1;
                while(map.get( target )!=null){
                    compare++;
                    target++;
                }
                answer = Math.max( compare,answer );
            }
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int nums[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive( nums ));
    }
}
