package sgyj.inflearn.seunggu.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution11 {
    /**
     * @title : 문자열 압축
     * @description : 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
     *                문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
     *                단 반복횟수가 1인 경우 생략합니다.
     * @input : 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     * @output : 첫 줄에 압축된 문자열을 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String word = reader.readLine();
        String[] words = word.split( "" );
        String temp = words[0];
        StringBuilder stringBuilder = new StringBuilder(temp);
        int cnt = 1;
        for ( int i = 1; i < words.length; i++ ) {
            String s = words[i];
            // 문자열이 같다면 카운팅
            if(s.equals( temp )) {
                cnt++;
            } else {    // 같지 않다면
                if(cnt != 1) {
                    stringBuilder.append( cnt );
                }
                temp = s;
                stringBuilder.append( temp );
                cnt = 1;
            }
        }
        if(cnt != 1) {
            stringBuilder.append( cnt );
        }

        return stringBuilder.toString();
    }
}