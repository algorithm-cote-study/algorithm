package sgyj.leetcode.yeji.section6;

// House Robber
public class Solution198 {
    private static int[] stillMoney;

    public static int rob(int[] nums) {
        int answer = 0;
        stillMoney = new int[nums.length];
        for(int n=0; n<nums.length; n++){
            stillMoney[n] = nums[n];
        }

        for(int n=2; n<nums.length; n++){
            int max = 0;
            for(int i=n-2; i>=0; i--){
                max= Math.max(max,stillMoney[i]);
            }
            stillMoney[n]+=max;
        }

        for(int money:stillMoney){
            answer = Math.max(answer,money);
        }


        return answer;
    }

    public static void main ( String[] args ) {
        int[] nums = {1,2,3,1};

        System.out.println(rob(nums));
    }

}
