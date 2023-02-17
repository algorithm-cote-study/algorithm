package sgyj.leetcode.yeji.section2;

public class NodeExample {

    public static void main ( String[] args ) {
        Node first = new Node( 1 );
        Node second = new Node( 2 );
        Node third = new Node( 3 );

        first.next = second;
        second.next = third;
        first.value = 6;
    }

}
