package sgyj.leetcode.yeji.section3;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeqeueExample {

    public static void main ( String[] args ) {
        Deque<Integer> q = new ArrayDeque<>();
        q.push( 1 );
        q.push( 2 );
        q.push( 3 );
        q.push( 4 );
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

    }
}
