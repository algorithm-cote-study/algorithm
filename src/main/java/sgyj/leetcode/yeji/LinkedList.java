package sgyj.leetcode.yeji;

import java.util.Optional;

class LinkedList {
    int value;
    Node next;
    Node head;
    Node tail;

    public void append( int value){
        Node nextNode = new Node(value);
        if( Optional.ofNullable(this.head).isPresent()){
            Node current = this.head;
            current.next = nextNode;
            tail.next = nextNode;
            tail = tail.next;
        }else{
            this.head = nextNode;
            this.tail = nextNode;
        }
    }

    public int get(int value){
        if(Optional.ofNullable( this.head ).isPresent()){
            Node target = this.head;
            for(int i=0; i<value; i++){
                target = target.next;
            }
            return target.value;
        }else{
            return -1;
        }

    }

    public void insertAt(int index, int value){
        Node newNode = new Node( value );
        Node target = this.head;
        for(int i=0; i<index-1; i++){
            target = target.next;
        }
        newNode.next = target.next;
        target.next = newNode;
    }

}
