package sgyj.leetcode.yeji;

import java.util.Optional;

class LinkedList {
    int value;
    Node next;
    Node head;
    Node tail;

    public void append( int value){
        Node current = new Node(value);
        if( Optional.ofNullable(this.head).isPresent()){
            tail.next = current;
            tail = tail.next;
        }else{
            this.head = current;
            this.tail = current;
        }
    }

    public int get(int value){
        if(Optional.ofNullable( this.head ).isPresent()){
            Node current = this.head;
            for(int i=0; i<value; i++){
                current = current.next;
            }
            return current.value;
        }else{
            return -1;
        }

    }

    public void insertAt(int index, int value){
        Node newNode = new Node( value );
        Node current = this.head;
        for(int i=0; i<index-1; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

}
