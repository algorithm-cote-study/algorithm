package sgyj.inflearn.seunggu.section8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Solution10 {

    private static final int[][] array = new int[7][7];
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {-1, 0, 1, 0};
    private static int count = 0;
    private static final boolean[][] checked = new boolean[7][7];
    /**
     * @title : 미로탐색
     * @description : 7*7 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하세요.
     *                출발점은 격자의 (1, 1) 좌표이고, 탈출 도착점은 (7, 7)좌표이다. 격자판의 1은 벽이고, 0은 통로이다.
     *                격자판의 움직임은 상하좌우로만 움직인다. 미로가 다음과 같다면
     *                위의 지도에서 출발점에서 도착점까지 갈 수 있는 방법의 수는 8가지이다.
     * @input : 7*7 격자판의 정보가 주어집니다.
     * @output : 첫 번째 줄에 경로의 가지수를 출력한다.
     *
     */
    public static void main (String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for(int i=0; i < 7; i++) {
                array[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            checked[0][0] = true;
            recursion( 0,0 );
            System.out.println(count);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void recursion(int x, int y) {
        if(x == 6 && y == 6) {
            count++;
            return;
        }
        for(int i=0; i<dx.length;i++) {
            int toX = x + dx[i];
            int toY = y + dy[i];
            if((toX < 0 || toY < 0) || (toX > 6 || toY > 6) || array[toX][toY] == 1) continue;
            if(!checked[toX][toY]) {
                checked[toX][toY] = true;
                recursion(toX, toY);
                checked[toX][toY] = false;
            }
        }
    }
}
