package sgyj.inflearn.seunggu.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Solution71 {

    private static int n;
    private static int m;
    private static boolean[] visited;
    private static int min = Integer.MAX_VALUE;


    /**
     * @title : 동전교환
     * @description : 다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
     *                각 단위의 동전은 무한정 쓸 수 있다.
     * @input : 첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
     *          그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.
     * @output : 첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            n = Integer.parseInt(reader.readLine());
            Integer[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
            Arrays.sort(array, Comparator.reverseOrder());
            m = Integer.parseInt( reader.readLine() );
            visited = new boolean[n];
            //recursion( 0);
            DFS(0, 0, array);
            System.out.println(min);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    /*static void recursion ( int number) {
        if(number == n) {
            List<Integer> list = new ArrayList<>();
            // 쓸수 있는 동전을 갖고 합을 만드는 작업
            for(int i=0; i< n; i++) {
                if(visited[i]) {
                    list.add( array[i] );
                }
            }
            list = list.stream().sorted( Comparator.reverseOrder()).collect( Collectors.toList());
            int total = m;
            int cnt = 0;
            for ( int amount : list ) {
                if ( amount > total ) continue;
                int mod = total / amount;
                cnt += mod;
                total = total - mod * amount;
            }
            if(cnt != 0 && total == 0) min = Math.min( min, cnt );
            return;
        }

        visited[number] = true;
        recursion( number + 1);
        visited[number] = false;
        recursion( number + 1);
    }*/

    static void DFS(int number, int sum, Integer[] array ) {
        if(sum > m ) return;
        if(number >= min) return;
        if(sum == m) {
            min = number;
            return;
        }
        for(int i=0; i<n; i++) {
            DFS(number+1, sum+array[i], array);
        }
    }

}
