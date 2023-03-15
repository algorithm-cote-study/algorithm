package sgyj.programmers.yeji.greedy;

// 조이스틱
public class Solution42860 {
    private static int answer;
    private static int min = Integer.MAX_VALUE;
    private static int[] visited;
    // A - 65, Z - 90
    public static int solution(String name) {
        visited = new int[name.length()];
        int startAlpha = name.charAt( 0 );

        if(startAlpha<=77){
            visited[0] = startAlpha+1;
            answer+= startAlpha+1;
        }else{
            visited[0] = 90-startAlpha;
            answer+= 90-startAlpha;
        }
        for(int i=1; i<name.length(); i++){
            moveJoyStick(1,visited[i-1], name,0);
        }
        return answer;
    }

    public static void moveJoyStick(int i, int cur, String name, int count){
        int result = Integer.valueOf(name.charAt( i ));
        int abs = Math.abs( 90 - cur );


    }
    public static void main ( String[] args ) {
        String name = "JEROEN";
        System.out.println(solution(name));
    }
}
