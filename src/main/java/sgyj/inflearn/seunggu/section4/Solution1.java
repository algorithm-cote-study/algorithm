package sgyj.inflearn.seunggu.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution1 {

    /**
     * @title : 학급 회장(해쉬)
     * @description : 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
     *                투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
     *                선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
     *                반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
     * @input : 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
     *          두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
     * @output : 학급 회장으로 선택된 기호를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution(reader));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int studentCount = Integer.parseInt( reader.readLine() );
        String vote = reader.readLine();
        String[] votes = vote.split( "" );
        Map<String, Integer> map = new HashMap<>();
        for ( String s : votes ) {
            map.put(s, map.getOrDefault( s, 0 ) + 1);
        }
        String result = "";
        int max = Integer.MIN_VALUE;
        for ( Entry<String, Integer> entry : map.entrySet() ) {
            if(entry.getValue() > max) {
                result = entry.getKey();
                max = entry.getValue();
            }
        }
        return result;
    }

}
