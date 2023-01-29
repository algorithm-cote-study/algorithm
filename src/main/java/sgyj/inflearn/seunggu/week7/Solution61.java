package sgyj.inflearn.seunggu.week7;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
public class Solution61 {
    /**
     * @title : 송아지 찾기 1(BFS : 상태트리탐색)
     * @description : 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
     *                현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
     *                송아지는 움직이지 않고 제자리에 있다.
     *                현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
     *                최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
     * @output : 점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
     */
    private static boolean[] checked;
    private static final int[] ids = {1, -1, 5};

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution( reader ));

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split(" ");
        int s = Integer.parseInt(lines[0]);
        int e = Integer.parseInt(lines[1]);
        checked = new boolean[e + 1];
        return BFS(s, e);
    }

    public static int BFS(int s, int e) {
        Deque<Integer> queue = new ArrayDeque<>();
        checked = new boolean[10001];
        checked[s] = true;
        queue.add( s );
        int l = 0;
        while(true) {
            int len = queue.size();
            for(int i=0; i < len; i++) {
                int x = queue.pop();
                for( int j : ids) {
                    int nx = x + j;
                    if(nx == e) return l + 1;
                    if(nx >= 1 && nx <= 10000 && !checked[nx]) {
                        checked[nx] = true;
                        queue.add( nx );
                    }
                }
            }
            l++;
        }
    }
}
