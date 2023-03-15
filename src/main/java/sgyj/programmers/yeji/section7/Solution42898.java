package sgyj.programmers.yeji.section7;

public class Solution42898 {
    private static int[][] distance;
    private static int minDistance = Integer.MAX_VALUE;
    private static int answer = 0;
    public static int solution(int m, int n, int[][] puddles) {
        distance = new int[n+1][m+1];
        // 방문할수 없는 곳
        for(int[] puddle : puddles){
            distance[puddle[0]][puddle[1]] = -1;
        }

        findDistance(1,1,n,m,0);

        return answer;
    }

    public static void findDistance(int x, int y, int n, int m,int i){
        if((x==m && y == n-1) || (y==n && x==m-1)){
            distance[x][y] = 0;
            if(minDistance == i){
                answer++;
            }
            if(minDistance>i){
                minDistance = i;
                answer = 1;
            }
            return;
        }
        if(x<n && y<m && distance[x][y] != -1){
            distance[x][y] = i;
            findDistance( x+1,y,n,m,i+1 );
            findDistance( x,y+1,n,m,i+1 );
        }

    }

    public static void main ( String[] args ) {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2,2}};

        System.out.println(solution(m,n,puddles));
    }
}
