package sgyj.inflearn.seunggu.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution6 {


    /**
     * @title : 중복문자제거
     * @description : 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
     *                중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     * @input : 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
     * @output : 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
     */
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in))) {
            System.out.print(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String word = reader.readLine();
        Set<String> hashSet = new LinkedHashSet<>();
        for ( char c : word.toCharArray() ) {
            hashSet.add( Character.toString( c ) );
        }
        StringBuilder stringBuilder = new StringBuilder();
        for ( String s : hashSet ) {
            stringBuilder.append( s );
        }
        return stringBuilder.toString();
    }

}
