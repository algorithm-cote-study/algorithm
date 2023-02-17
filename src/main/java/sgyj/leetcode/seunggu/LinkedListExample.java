package sgyj.leetcode.seunggu;

public class LinkedListExample {

    public static void main ( String[] args ) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add( 1 );
        linkedList.add( 2 );
        linkedList.add( 3 );
        linkedList.add( 4 );
        linkedList.add( 2, 9 );
        linkedList.add( 4, 5 );
        linkedList.add( 111 );
        for(int i=0; i< linkedList.size(); i++) {
            System.out.println(linkedList.get( i ));
        }
    }

}
