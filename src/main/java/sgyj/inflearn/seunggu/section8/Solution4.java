package sgyj.inflearn.seunggu.section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {

    private static int n;
    private static int m;
    private static int[] numbers;
    private static StringBuilder stringBuilder;
    /**
     * @title : 중복순열 구하기
     * @description : 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열 하는 방법을 모두 출력합니다.
     * @input : 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
     * @output : 첫 번째 줄에 결과를 출력합니다.
     *           출력순서는 사전순으로 오름차순으로 출력합니다.
     */
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
        numbers = new int[m];
        stringBuilder = new StringBuilder();
        recursion(0);
        System.out.println(stringBuilder);
        return stringBuilder.toString().trim();
    }

    static void recursion( int number ) {
        if(number == m) {
            for(int x : numbers) {
                stringBuilder.append( x ).append( " " );
            }
            stringBuilder.trimToSize();
            stringBuilder.append( "\n" );
            return;
        }
        for(int i=1; i<=n; i++) {
            numbers[number] = i;
            recursion( number+1 );
        }

    }

}
