package sgyj.leetcode.yeji.section2;

class BrowserHistory {
    private int size = 0;
    Cache head;
    Cache current;

    public int getSize(){
        return this.size;
    }

    BrowserHistory(String homePage){
        Cache newNode = new Cache( homePage );
        this.head = newNode;
        this.current = newNode;
    }

    public void visit(String url){
        current.next = new Cache( url,current );
        current = current.next;
        System.out.println("None");
    }

    public String back(int steps){
        while ( steps>0 && current.prev != null ){
            steps-=1;
            this.current = current.prev;
        }
        System.out.println(current.url);
        return current.url;
    }

    public String forward(int steps){
        while ( steps>0 && current.next != null ){
            steps -= 1;
            this.current = current.next;
        }
        System.out.println(current.url);
        return current.url;
    }

}
