package sgyj.leetcode.yeji.section6;

import java.util.Arrays;

// coin change
public class Solution322 {

    public int coinChange(int[] coins, int amount) {
        int[] result = new int[amount+1];
        Arrays.fill( result, Integer.MAX_VALUE - 1);
        result[0] = 0;

        for(int coin : coins){
            for(int n = coin; n<=amount; n++){
                int tmp = result[n-coin] + 1;
                if(result[n]>tmp) result[n] = tmp;
            }
        }

        return result[result.length-1] == Integer.MAX_VALUE-1 ? -1 : result[result.length-1];
    }

}
