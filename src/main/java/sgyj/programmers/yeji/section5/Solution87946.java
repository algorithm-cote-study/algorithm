package sgyj.programmers.yeji.section5;

public class Solution87946 {
    private static boolean[] check;
    private static int answer = -1;

    public static int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];

        dfs(k,dungeons,0);

        return answer;
    }

    public static void dfs(int tired, int[][] dungeons, int cnt){
        for(int i=0; i<dungeons.length; i++){
            if(!check[i] && dungeons[i][0]<=tired){
                check[i] = true;
                dfs(tired-dungeons[i][1],dungeons,cnt+1);
                check[i] = false;
            }
        }
        answer = Math.max(answer,cnt);
    }
    public static void main ( String[] args ) {
        int k = 80;
        int[][] dungeons = {
//            [[80,20],[50,40],[30,10]]
            {80,20},{50,40},{30,10}
        };

        System.out.println( solution(k,dungeons) );
    }
}
