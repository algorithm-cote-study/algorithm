package sgyj.inflearn.seunggu.section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution1 {

    private static final int[] checked = new int[1001];
    private static int[] array;
    private static String answer;
    /**
     * @title : 합이 같은 부분집합(DFS : 아마존 인터뷰)
     * @description : N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
     *                두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
     *                둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.
     *                예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.
     * @input : 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
     *          두 번째 줄에 집합의 원소 N개가 주어진다. 각 원소는 중복되지 않는다.
     * @output : 첫 번째 줄에 “YES" 또는 ”NO"를 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int m = Integer.parseInt( reader.readLine() );
        array = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        answer = "NO";
        for(int x : array) {
            checked[x] = 1;
        }
        recursive( 1, m );
        return answer;
    }

    static void recursive(int n, int m ) {
        if(n == m+1) {
            int sum = 0;
            int compareSum = 0;
            for(int i=0; i<m; i++) {
                if(checked[array[i]] == 2) sum+= array[i];
                else if(checked[array[i] ]== 1) compareSum += array[i];
            }
            if((sum == compareSum) && sum != 0) answer = "YES";
            return;
        }
        checked[array[n-1]] = 2;
        recursive( n+1, m );
        checked[array[n-1]] = 1;
        recursive( n+1, m );
    }
}
