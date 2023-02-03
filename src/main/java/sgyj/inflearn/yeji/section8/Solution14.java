package sgyj.inflearn.yeji.section8;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution14 {
    // 섬나라 아일랜드 (BFS)
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {1,1,0,-1,-1,-1,0,1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};

    public static int solution(int n){
        int answer = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1 && !visited[i][j]){
                    Queue<Point> Q = new LinkedList<>();
                    Q.offer(new Point(i,j));
                    checkIsland(Q,i,j,n);
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void checkIsland(Queue<Point> Q, int i, int j,int n){
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int l=0; l<len; l++){
                Point point = Q.poll();
                visited[point.x][point.y] = true;
                for(int d=0; d<dx.length;d++){
                    int tx = point.x + dx[d];
                    int ty = point.y + dy[d];
                    if(tx>=0 && tx<n && ty>=0 && ty<n &&map[tx][ty]==1 && !visited[tx][ty]){
                        Q.offer( new Point( tx,ty ) );
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        map = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n));
    }
}
