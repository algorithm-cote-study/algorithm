package sgyj.programmers.seunggu.greedy;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main42885 {

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort( people);
        Deque<Integer> deque = new LinkedList<>();
        for(int i= people.length -1; i >= 0; i--) {
            deque.add(people[i]);
        }

        while(!deque.isEmpty()) {
            int first = deque.pop();
            while(!deque.isEmpty()) {
                int peek = deque.peekLast();
                if(first + peek <= limit) first += deque.pollLast();
                else break;
            }
            answer++;
        }
        return answer;
    }

}
