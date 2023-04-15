package sgyj.leetcode.seunggu.section6;

public class UniquePath {
    private static final int[] dx = new int[] {0, -1};
    private static final int[] dy = new int[] {-1, 0};
    private static int[][] board;
    static int uniquePaths(int m, int n) {
        board = new int[m][n];
        for(int i=0; i<board.length; i++) {
            board[i][0] = 1;
            for(int j=1; j<board[i].length; j++) {
                if(i == 0) {
                    board[i][j] = 1;
                    continue;
                }
                for(int k=0; k<dx.length; k++) {
                    board[i][j] += board[i+dx[k]][j+dy[k]];
                }
            }
        }
        return board[m-1][n-1];
    }
}
