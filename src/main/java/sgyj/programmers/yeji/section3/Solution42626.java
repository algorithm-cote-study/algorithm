package sgyj.programmers.yeji.section3;

import java.util.PriorityQueue;

public class Solution42626 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for(int sco : scoville){
            pQ.add(sco);
        }

        int compare = pQ.poll();
        while(!pQ.isEmpty()){
            if(compare >= K) return answer;
            int next = pQ.poll() * 2;
            pQ.add(compare+next);
            compare = pQ.poll();
            answer++;
        }

        return compare>=K ? answer : -1;
    }
    public static void main ( String[] args ) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville,K));
    }
}
