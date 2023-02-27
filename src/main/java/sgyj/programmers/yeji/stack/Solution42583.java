package sgyj.programmers.yeji.stack;

import java.util.ArrayDeque;
import java.util.Deque;

// 다리를 지나는 트럭
public class Solution42583 {

    private static int solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 1;
        if(truck_weights.length == 1) return bridge_length + 1;
        Deque<Integer> q = new ArrayDeque<>();
        for(int truck : truck_weights){
            q.offer( truck );
        }

        int bridge = 1;
        int i = 0;
        int max = q.poll();
        while ( !q.isEmpty()  ){
            if(bridge == bridge_length){
                max-=truck_weights[i];
                bridge = 0;
                i++;
            }
            if(max+q.peek()<=weight){
                max+=q.poll();
            }
            bridge++;
            answer++;
        }

        return answer;
    }

    private static int validCompare(int i, int[] truck_weights){
        if(i<truck_weights.length) return truck_weights[i];
        return  0;
    }

    public static void main ( String[] args ) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        System.out.println(solution(bridge_length,weight,truck_weights));
    }
}
