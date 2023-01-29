package sgyj.inflearn.seunggu.week6;

public class Node {

    int data;
    Node lt;
    Node rt;

    private Node ( int data ) {
        this.data = data;
    }

    public static Node createNode ( int data ) {
        return new Node( data );
    }

    public void setLt ( Node node ) {
        this.lt = node;
    }

    public void setRt (Node node) {
        this.rt = node;
    }

    public Node getLt() {
        return this.lt;
    }

    public Node getRt() {
        return this.rt;
    }

}
