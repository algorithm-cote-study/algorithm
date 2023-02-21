package sgyj.leetcode.yeji.section4;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    private static int[] twoSum(int[] nums, int target){
        int[] answer =  new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        map.put( nums[0],0 );
        for(int i=1; i<nums.length; i++){
            int findKey = target - nums[i];
            if(map.containsKey( findKey )){
                answer[0] = map.get( findKey );
                answer[1] = i;
                return answer;
            }
            map.put(nums[i],i);
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int[] nums = {3,2,4};
        int target = 6;
        for ( int a : twoSum( nums, target ) ) {System.out.print(a + " ");}
    }
}
