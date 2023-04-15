package sgyj.leetcode.seunggu.section6;

public class uniquePath_ver1 {
    private static boolean board[][];
    private static int answer;
    private static int[] dx = {1, 0};
    private static int[] dy = {0, 1};
    public int uniquePaths(int m, int n) {
        board = new boolean[m][n];
        answer= 0;
        board[0][0] = true;
        dfs(0, 0, m, n);
        return answer;
    }

    public void dfs(int x, int y, int m, int n) {
        if(x == m-1 && y == n-1) {
            answer++;
            return;
        }
        for(int i=0; i<dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < m && ny >= 0 && ny < n && !board[nx][ny]) {
                board[nx][ny] = true;
                dfs(nx, ny, m, n);
                board[nx][ny] = false;
            }
        }
    }
}
