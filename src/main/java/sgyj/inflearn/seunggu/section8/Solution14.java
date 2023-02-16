package sgyj.inflearn.seunggu.section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution14 {
private static int n;
    private static int[][] array;
    private static boolean[][] checked;
    private static int result = 0;
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};


    /**
     * @title : 섬나라 아일랜드
     * @description : N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
     *                각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
     *                섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.
     *                만약 위와 같다면 섬의 개수는 5개입니다.
     * @input : 첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다.
     *          두 번째 줄부터 격자판 정보가 주어진다.
     * @output : 첫 번째 줄에 섬의 개수를 출력한다.
     */
    public static void main ( String[] args )  {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in))) {
            System.out.println(solution(reader));
        }catch ( IOException e) {
            e.printStackTrace();
        }
    }

    static int solution( BufferedReader reader ) throws IOException {
        n = Integer.parseInt(reader.readLine());
        array = new int[n][n];
        checked = new boolean[n][n];
        for(int i=0; i<n; i++) {
            array[i] = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        }
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if(array[i][j] == 1) {
                   recursion(i, j);
                }
            }
        }
        return result;
    }

    static void recursion(int x, int y) {
        Deque<Point> deque = new ArrayDeque<>();
        deque.add(Point.of(x, y));
        int count = 0;
        while(!deque.isEmpty()) {
            Point point = deque.pop();
            if(!checked[point.getX()][point.getY()]) {
                checked[point.getX()][point.getY()] = true;
                for(int i=0; i< dx.length; i++) {
                    x = point.getX() + dx[i];
                    y = point.getY() + dy[i];
                    if(x >= 0 && x <= n-1 && y >= 0 && y <= n-1 && !checked[x][y] && array[x][y] == 1) {
                        deque.add(Point.of(x, y));
                    }
                }
                count++;
            }
        }
        if(count > 0) result++;
    }


    static class Point {

        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Point of(int x, int y) {
            return new Point(x, y);
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

    }
}
