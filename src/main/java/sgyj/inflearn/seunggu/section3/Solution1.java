package sgyj.inflearn.seunggu.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution1 {

    /**
     * @title : 두 배열 합치기
     * @description : 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
     *          두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
     *          세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
     *          네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
     *          각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
     * @output : 오름차순으로 정렬된 배열을 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int firstCount = Integer.parseInt( reader.readLine() );
        int[] firstArray = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int secondCount = Integer.parseInt( reader.readLine() );
        int[] secondArray = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] lastArray = new int[firstCount+secondCount];
        int totalCount = firstCount + secondCount;
        if ( firstCount >= 0 ) System.arraycopy( firstArray, 0, lastArray, 0, firstCount );
        int count = 0;
        for(int i= firstCount; i <totalCount; i++) {
            lastArray[i] = secondArray[count++];
        }
        Arrays.sort( lastArray );
        StringBuilder stringBuilder = new StringBuilder();
        for ( int i : lastArray ) {
            stringBuilder.append( i ).append( " " );
        }
        return stringBuilder.toString();
    }

}
