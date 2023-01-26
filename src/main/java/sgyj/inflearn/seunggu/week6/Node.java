package sgyj.inflearn.seunggu.week6;

class Node {

    int data;
    Node lt;
    Node rt;

    private Node ( int data ) {
        this.data = data;
    }

    public static Node createNode ( int data ) {
        return new Node( data );
    }

}
