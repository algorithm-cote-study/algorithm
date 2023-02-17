package sgyj.leetcode.seunggu;


public class LinkedList<E> implements List<E> {

    private int size = 0;

    private Node<E> head;

    private Node<E> lastNode;

    public int size() {
        return this.size;
    }

    @Override
    public E get ( int index ) {
        Node<E> node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public boolean add ( int index, E data ) {
        if(index >= size) throw new RuntimeException("범위를 벗어난 수는 입력하실 수 없습니다.");
        Node<E> newNode = new Node<>( data );
        Node<E> currentNode = this.head;
        for(int i=0; i<index; i++) {
            currentNode = currentNode.next;
        }
        newNode.prev = currentNode.prev;
        newNode.next = currentNode;
        currentNode.prev.next = newNode;
        currentNode.prev = newNode;
        if(index == 0) this.head = newNode;
        size++;
        return true;
    }

    public boolean add(E data) {
        Node<E> currentNode = new Node<>( data );
        if(this.head == null) this.head = currentNode;
        else {
            currentNode.prev =this.lastNode;
            this.lastNode.next = currentNode;
        }
        this.lastNode = currentNode;
        size++;
        return true;
    }


    static class Node<T> {
        private final T data;
        private Node<T> prev;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }

    }

}
