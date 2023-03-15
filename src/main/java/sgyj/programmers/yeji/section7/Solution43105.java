package sgyj.programmers.yeji.section7;

public class Solution43105 {

    public static int solution(int[][] triangle) {
        int answer = 0;
        int n = triangle.length;
        int[][] visited = new int[n][triangle[n-1].length];
        visited[0][0] = triangle[0][0];
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
               if(j==0){
                   visited[i][j] = visited[i-1][j] + triangle[i][j];
               }else if(j == i){
                   visited[i][j] = visited[i-1][j-1] + triangle[i][j];
               }else{
                   int compare = triangle[i][j] + visited[i-1][j-1];
                   int compare2 = triangle[i][j] + visited[i-1][j];
                   int max = Math.max( compare2,compare );
                   visited[i][j] = max;
               }
            }
        }

        for(int v : visited[n-1]){
            answer = Math.max( answer,v );
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int[][] triangle = {
            {7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}
        };

        System.out.println(solution(triangle));
    }
}
