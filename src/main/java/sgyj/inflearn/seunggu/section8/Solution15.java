package sgyj.inflearn.seunggu.section8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {

    private static int n;
    private static int m;
    private static int[][] array;
    private static final List<Point> pizzas = new ArrayList<>();
    private static final List<Point> houses = new ArrayList<>();

    private static Point[] combination;
    private static int answer = Integer.MAX_VALUE;


    /**
     * @title : 피자 배달 거리(삼성 SW역량평가 기출문제 : DFS활용)
     * @description : N×N 크기의 도시지도가 있습니다. 도시지도는 1×1크기의 격자칸으로 이루어져 있습니다.
     *                각 격자칸에는 0은 빈칸, 1은 집, 2는 피자집으로 표현됩니다. 각 격자칸은 좌표(행번호, 열 번호)로 표현됩니다.
     *                행번호는 1번부터 N번까지이고, 열 번호도 1부터 N까지입니다.
     *                도시에는 각 집마다 “피자배달거리”가 았는데 각 집의 피자배달거리는 해당 집과 도시의 존재하는
     *                피자집들과의 거리 중 최소값을 해당 집의 “피자배달거리”라고 한다.
     *                집과 피자집의 피자배달거리는 |x1-x2|+|y1-y2| 이다.
     *                예를 들어, 도시의 지도가 아래와 같다면
     *                (1, 2)에 있는 집과 (2, 3)에 있는 피자집과의 피자 배달 거리는 |1-2| + |2-3| = 2가 된다.
     *                최근 도시가 불경기에 접어들어 우후죽순 생겼던 피자집들이 파산하고 있습니다.
     *                도시 시장은 도시에 있는 피자집 중 M개만 살리고 나머지는 보조금을 주고 폐업시키려고 합니다.
     *                시장은 살리고자 하는 피자집 M개를 선택하는 기준으로 도시의 피자배달거리가 최소가 되는 M개의 피자집을 선택하려고 합니다.
     *                도시의 피자 배달 거리는 각 집들의 피자 배달 거리를 합한 것을 말합니다.
     * @input : 첫째 줄에 N(2 ≤ N ≤ 50)과 M(1 ≤ M ≤ 12)이 주어진다.
     *          둘째 줄부터 도시 정보가 입력된다.
     * @output : 첫 번째 줄에 섬의 개수를 출력한다.
     */
    public static void main ( String[] args )  {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split(" ");
        n = Integer.parseInt(lines[0]);     // 도시 크기
        m = Integer.parseInt(lines[1]);     // 피자집 개수
        array = new int[n][n];

        combination = new Point[m];
        for(int i=0; i<n; i++) {
            array[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        makePizzaArray();
        dfs( 0, 1 );
        return answer;
    }


    static void makePizzaArray () {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(array[i][j] == 2) {
                    pizzas.add( Point.of( i, j ) );
                } else if(array[i][j] == 1) {
                    houses.add( Point.of( i,j ) );
                }
            }
        }
    }

    static void dfs(int number, int s) {
        if(number == m) {
            int sum = 0;
            for ( Point house : houses ) {
                int dis = Integer.MAX_VALUE;
                for ( Point pizza : combination ) {
                    dis = Math.min( pizza.calculateDistance( house ), dis );
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
            return;
        }
        for(int i=s; i < pizzas.size(); i++) {
            combination[number] = pizzas.get( i );
            dfs(number+1, i+1);
        }

    }



    static class Point {

        private final int x;
        private final int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Point of(int x, int y ) {
            return new Point(x, y);
        }
        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public int calculateDistance(Point point) {
            return Math.abs(point.getX() - this.x) + Math.abs(point.getY() - this.y);
        }

    }

}
