package sgyj.inflearn.yeji.section8;

import java.util.*;

public class Solution11 {
    static int[][] mirro = new int[7][7];
    static int[][] visited = new int[7][7];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};

    static int solution(){
        Queue<Integer[]> Q = new LinkedList<>();
        Q.offer(new Integer[]{0,0});
        int L = 1;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Integer[] location = Q.poll();
                for(int d=0; d<dx.length; d++){
                    int x = location[0] + dx[d];
                    int y = location[1] + dy[d];
                    if(x == -1 || y == -1 || x>6 || y>6) continue;
                    if(x==6 && y==6) {
                        return L;
                    }
                    if(mirro[x][y] != 1 && visited[x][y]==0){
                        visited[x][y] = 1;
                        Q.offer(new Integer[]{x,y});
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<mirro.length; i++){
            for(int j=0; j<mirro.length; j++){
                mirro[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution());
    }
}
