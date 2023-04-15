package sgyj.programmers.seunggu.greedy;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main42883 {

    public static void main ( String[] args ) {
        System.out.println(solution( "1231234", 3 ));
    }
    public static String solution(String number, int k) {
        Deque<String> deque = new ArrayDeque<>();
        String[] numbers = number.split("");
        deque.push(numbers[0]);
        int size = numbers.length - k;
        int idx = 1;
        while(idx < numbers.length) {
            if(numbers.length - idx + deque.size() == size) {
                deque.push(numbers[idx++]);
                continue;
            }
            int now = Integer.parseInt(numbers[idx]);
            int pop = Integer.parseInt(deque.pop());
            while(now > pop && !deque.isEmpty() && deque.size() + numbers.length - idx > size) {
                pop = Integer.parseInt(deque.pop());
            }
            if(pop >= now) deque.push(Integer.toString( pop ));
            if(deque.size() < size) deque.push(Integer.toString(now));
            idx++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int len = deque.size();
        for(int i=0; i<len; i++) {
            stringBuilder.insert(0, deque.pop());
        }
        return stringBuilder.toString();
    }

    public static String solution1(String number, int k) {
        Deque<String> deque = new ArrayDeque<>();
        String[] numbers = number.split("");
        int size = numbers.length - k;
        for ( String s : numbers ) {
            if ( deque.size() == size ) {
                boolean find = false;
                for ( int j = 0; j < size; j++ ) {
                    if ( find ) {
                        String pop = deque.pop();
                        deque.add( pop );
                        continue;
                    }
                    int now = Integer.parseInt( deque.pop() );
                    int next = Integer.parseInt( deque.peek() );
                    if ( now >= next ) {
                        deque.add( Integer.toString( now ) );
                    } else {
                        find = true;
                    }
                }
            }
            deque.add( s );
        }
        StringBuilder stringBuilder = new StringBuilder();
        int len = deque.size();
        for(int i=0; i<len; i++) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString();
    }

}
