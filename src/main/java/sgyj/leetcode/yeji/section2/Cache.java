package sgyj.leetcode.yeji.section2;

public class Cache {

    String url;
    Cache next;
    Cache prev;

    Cache(String url){
        this.url = url;
    }

    Cache(String url,Cache prev){
        this.url = url;
        this.prev = prev;
    }

}
