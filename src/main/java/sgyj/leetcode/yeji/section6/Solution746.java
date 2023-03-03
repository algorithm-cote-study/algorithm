package sgyj.leetcode.yeji.section6;

public class Solution746 {

    public static int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length+1];
        int answer = 0;

        for(int i=0; i<cost.length; i++){
            minCost[i] = cost[i];
        }

        for(int i=2; i<minCost.length; i++){
            int target1 = minCost[i] + minCost[i-1];
            int target2 = minCost[i] + minCost[i-2];
            minCost[i] = Math.min(target1,target2);
        }

        return minCost[minCost.length-1];
    }

    public static void main ( String[] args ) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs( cost ));
    }
}
