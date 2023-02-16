package sgyj.inflearn.seunggu.section8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution11 {

    /**
     * @title :
     * @description : 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
     *                중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     * @input : 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
     * @output : 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
     */
    private static final int[][] array = new int[7][7];
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {-1, 0, 1, 0};
    private static final boolean[][] visited = new boolean[7][7];

    public static void main (String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for(int i=0; i < 7; i++) {
                array[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            System.out.println(recursion());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int recursion() {
        Deque<Point> queue = new ArrayDeque<>();
        queue.add(Point.of(0, 0));
        visited[0][0] = true;
        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0; i<len; i++) {
                Point pop = queue.pop();
                if(pop.isEndPoint()) {
                    return level;
                }
                for(int j=0; j<dx.length; j++) {
                    int x = pop.getX() + dx[j];
                    int y = pop.getY() + dy[j];
                    Point point = Point.of( x, y );
                    if( x >= 0 && x <= 6 && y >= 0 && y <= 6 && !visited[x][y] && point.isKeepGoing()) {
                        visited[x][y] = true;
                        if(point.isEndPoint()) {
                            level++;
                            return level;
                        }
                        queue.add(Point.of(x, y));
                    }
                }
            }
            level++;
        }
        return -1;

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

        public boolean isEndPoint() {
            return this.x == 6 && this.y == 6;
        }

        public boolean isKeepGoing() {
            return array[this.x][this.y] == 0;
        }
    }


}
