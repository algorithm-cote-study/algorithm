package sgyj.inflearn.seunggu.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution24 {
    /**
     * @title : 멘토링
     * @description : 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
     *                멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
     *                선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
     *                만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
     *                M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.
     *          두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
     *          만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.
     * @output : 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public static int solution ( BufferedReader reader ) throws IOException {
        String firstLine = reader.readLine();
        String[] lines = firstLine.split( " " );
        int classNumber = Integer.parseInt( lines[0] );
        int testCount = Integer.parseInt( lines[1] );
        int[][] array = new int[testCount][classNumber];
        for(int i=0; i<testCount; i++) {
            array[i] = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt).toArray();
        }
        return solution( classNumber, testCount, array );
    }

    static int solution ( int classNumber, int testCount, int[][] array ) {
        Map<Integer, Map<Integer, Integer>> studentMap = new HashMap<>();
        for(int i=0; i < classNumber; i++) {
            Map<Integer, Integer> betterStudentMap = studentMap.getOrDefault( i + 1, new HashMap<>() );
            for(int j=0; j < testCount; j++) {
                setCount( classNumber, i, betterStudentMap, array[j] );
                studentMap.put( i+1, betterStudentMap );
            }
        }
        int result = 0;
        for ( Entry<Integer, Map<Integer, Integer>> integerMapEntry : studentMap.entrySet() ) {
            Map<Integer, Integer> valueMap = integerMapEntry.getValue();
            for ( Entry<Integer, Integer> valueEntry : valueMap.entrySet() ) {
                if( valueEntry.getValue() == testCount ) {
                    result++;
                }
            }
        }
        return result;
    }

    private static void setCount ( int classNumber, int i, Map<Integer, Integer> betterStudentMap, int[] array ) {
        for(int k=0; k < classNumber; k ++) {
            int nowStudent = array[k];
            if( nowStudent == i + 1) {
                break;
            }
            betterStudentMap.put( nowStudent, betterStudentMap.getOrDefault( nowStudent, 0 ) + 1);
        }
    }
}
