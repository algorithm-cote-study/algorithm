package sgyj.programmers.yeji.dfsbfs;

import java.util.ArrayList;
import java.util.List;

public class Solution43162 {
    private static boolean[] visited;
    static List<List<Integer>> computerList;

    private static int answer = 0;
    public static int solution(int n, int[][] computers) {
        visited = new boolean[n+1];
        computerList = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++){
            computerList.add( new ArrayList<>(n+1) );
        }

        for(int i=0; i<computers.length; i++){
            for(int j=0; j<computers[i].length; j++){
                if(computers[i][j] != 0){
                    computerList.get( i+1 ).add( j+1 );
                }
            }
        }

        for(int i=1; i<computerList.size(); i++){
            if(!visited[i] ){
                visited[i] = true;
                findNetwork(computerList.get( i ),0);
                answer++;
            }
        }

        return answer;
    }

    private static void findNetwork(List<Integer> netWork, int index){
        if(index != netWork.size()){
            int target = netWork.get( index );
            if ( !visited[target] ){
                visited[target] = true;
                findNetwork( computerList.get( target ),0 );
            }
            findNetwork( netWork,index+1 );
        }
    }

    public static void main ( String[] args ) {
        int[][] computers = {
            {1,1,0},{1,1,1},{0,0,1}
        };
        int n = 3;
        System.out.println(solution(n,computers));
    }
}
