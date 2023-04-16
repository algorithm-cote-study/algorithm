package sgyj.programmers.yeji.section1;

import java.util.HashMap;
import java.util.Map;

// 폰켓몬
public class Solution1845 {
    private int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        if(max<=map.size()) return max;
        return map.size();
    }

    public static void main ( String[] args ) {

    }
}
