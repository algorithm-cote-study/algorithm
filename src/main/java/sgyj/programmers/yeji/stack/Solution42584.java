package sgyj.programmers.yeji.stack;

import java.util.ArrayDeque;
import java.util.Deque;

// 주식
public class Solution42584 {

    private static int[] solution(int[] prices){
        int[] answer = new int[prices.length];
        Deque<Integer> q = new ArrayDeque<>();
        for(int price : prices){
            q.offer( price );
        }

        int i = 0;
        int r = 0;
        while ( !q.isEmpty() ){
            int target = q.poll();
            for(int j=i+1; j<prices.length; j++){
                if(target>prices[j]){
                    r++;
                    break;
                }
                r++;
            }
            answer[i] = r;
            i++;
            r = 0;
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int[] prices = {1,2,3,2,3};
        for(int a : solution(prices)){
            System.out.print(a+ " ");
        }
    }
}
