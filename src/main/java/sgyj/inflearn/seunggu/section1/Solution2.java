package sgyj.inflearn.seunggu.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {

    /**
     * @title : 대소문자 변환
     * @description : 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
     * @input : 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
     *          문자열은 영어 알파벳으로만 구성되어 있습니다.
     * @output : 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
     */
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in))) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String word = reader.readLine();
        char[] chars = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for ( char aChar : chars ) {
            if(Character.isUpperCase( aChar )) {
                stringBuilder.append( Character.toLowerCase( aChar ) );
            } else {
                stringBuilder.append( Character.toUpperCase( aChar ) );
            }
        }
        return stringBuilder.toString();
    }
}
