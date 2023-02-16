package sgyj.inflearn.seunggu.section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution8 {

    /**
     * @title : 수열 추측하기
     * @description : 가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다. 그리고 둘째 줄부터 차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다.
     *                예를 들어 N이 4 이고 가장 윗 줄에 3 1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.
     *                3 1 2 4
     *                 4 3 6
     *                  7 9
     *                  16
     *               N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.
     *               단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.
     * @input : 첫째 줄에 두개의 정수 N(1≤N≤10)과 F가 주어진다.
     *          N은 가장 윗줄에 있는 숫자의 개수를 의미하며 F는 가장 밑에 줄에 있는 수로 1,000,000 이하이다.
     * @output : 첫째 줄에 삼각형에서 가장 위에 들어갈 N개의 숫자를 빈 칸을 사이에 두고 출력한다.
     *           답이 존재하지 않는 경우는 입력으로 주어지지 않는다.
     */
    private static int n;
    private static int m;
    private static String answer;
    private static int[] arr;
    private static boolean[] visited;
    private static int[] initArray;

    static boolean flag;
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split( " ");
        n = Integer.parseInt(lines[0]);
        m = Integer.parseInt(lines[1]);
        arr = new int[n];
        visited = new boolean[n+1];
        initArray = new int[n];
        flag = false;
        for(int i=0; i < n; i++) {
            initArray[i] = i+1;
        }
        DFS(0);
        return answer;
    }

    static void DFS(int number) {
        if(number == n) {
            DFS(arr, arr);
            return;
        }

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[number] = initArray[i];
                DFS( number + 1 );
                visited[i] = false;
            }
        }

    }
    static void DFS(int[] arr, int [] originArr) {
        if(flag) return;
        if(arr.length == 1 ) {
            if(arr[0] > m) return;
            StringBuilder stringBuilder = new StringBuilder();
            for(int x : originArr) {
                stringBuilder.append( x ).append( " " );
            }
            if(arr[0] == m) {
                answer = stringBuilder.toString();
                flag = true;
            }
            return;
        }
        int[] tempArr = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++) {
            tempArr[i] = arr[i] + arr[i+1];
        }
        DFS(tempArr, originArr);
    }

}
