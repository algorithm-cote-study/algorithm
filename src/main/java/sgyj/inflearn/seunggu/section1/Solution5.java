package sgyj.inflearn.seunggu.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution5 {

    /**
     * @title : 특정 문자 뒤집기
     * @description : 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
     *                특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
     * @input : 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
     * @output : 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
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
            if(Character.isAlphabetic( aChar )) {
                stringBuilder.append( aChar );
            }
        }
        int index = 0;
        char[] reverseChar = stringBuilder.reverse().toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for ( char aChar : chars ) {
            if(!Character.isAlphabetic( aChar )) {
                result.append( aChar );
            } else {
                result.append( reverseChar[index++] );
            }
        }
        return result.toString();
    }

}
