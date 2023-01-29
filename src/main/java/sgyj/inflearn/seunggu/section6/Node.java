package sgyj.inflearn.seunggu.section6;

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

    public void setLt(Node lt) {
        this.lt = lt;
    }

    public void setRt(Node rt) {
        this.rt = rt;
    }

    public Node getRt() {
        return this.rt;
    }

    public Node getLt() {
    return this.lt;
    }

    public int getData () {
        return this.data;
    }
}
