package sgyj.inflearn.yeji.week6;

public class Solution54 {

    public static void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(  n+" " );
        }
    }

    public static void main ( String[] args ) {
        DFS(3);
    }
}
