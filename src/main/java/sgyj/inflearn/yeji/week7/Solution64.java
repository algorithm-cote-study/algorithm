package sgyj.inflearn.yeji.week7;

public class Solution64 {
    // n : 노드
    // m : 간선
    static int n,m, answer = 0;
    static int[] ch;
    static int[][] input;
    public static void DFS(int v){
        if(v == n) answer++;
        else{
            for(int i = 1; i<=n; i++){
                if(input[v][i]==1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i); // 완료했을 경우 되돌아오는 시점
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main ( String[] args ) {
        n = 5;
        m = 9;
        input = new int[][]{{ 1, 2 },{1,3},{1,4},{2,1},{2,3},{2,5},{3,4},{4,2},{4,5} };
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
