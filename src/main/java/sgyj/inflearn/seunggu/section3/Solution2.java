package sgyj.inflearn.seunggu.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution2 {
    /**
     * @title : 공통원소 구하기
     * @description : A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
     *          두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     *          세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
     *          네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     *          각 집합의 원소는 1,000,000,000이하의 자연수입니다.
     * @output : 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution(BufferedReader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        reader.readLine();
        int[] aArray = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        Arrays.sort( aArray );
        reader.readLine();
        int[] bArray = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        Arrays.sort( bArray );
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for ( int integer : aArray ) {
            map.put(integer, map.getOrDefault( integer, 0 ) + 1);
        }
        for ( int integer : bArray ) {
            map.put(integer, map.getOrDefault( integer, 0 ) + 1);
        }
        for ( Entry<Integer, Integer> entry : map.entrySet() ) {
            if(entry.getValue() > 1) {
                stringBuilder.append( entry.getKey() ).append( " " );
            }
        }
        return stringBuilder.toString();
    }
}
