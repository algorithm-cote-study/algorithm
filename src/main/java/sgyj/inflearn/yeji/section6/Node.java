package sgyj.inflearn.yeji.section6;

public class Node {

    int data;
    public Node lt;
    public Node rt;

    public Node ( int val ) {
        data = val;
        lt = rt = null;
    }

    public int getData () {
        return data;
    }

    public void setData ( int data ) {
        this.data = data;
    }

    public Node getLt () {
        return lt;
    }

    public void setLt ( Node lt ) {
        this.lt = lt;
    }

    public Node getRt () {
        return rt;
    }

    public void setRt ( Node rt ) {
        this.rt = rt;
    }
}
