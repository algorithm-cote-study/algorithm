package sgyj.inflearn.seunggu.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution10 {

    /**
     * @title : 가장 짧은 문자거리
     * @description : 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     *          문자열의 길이는 100을 넘지 않는다.
     * @output : 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String readLine = reader.readLine();
        String[] words = readLine.split( " " );
        String word = words[0];
        String confirmWord = words[1];
        char[] charArray = word.toCharArray();
        List<Integer> saveConfirmWords = saveConfirmWords( confirmWord, charArray );
        StringBuilder stringBuilder = new StringBuilder();
        for ( int i = 0; i < charArray.length; i++ ) {
            char c = charArray[i];
            String s = Character.toString( c );
            if(s.equals( confirmWord )) {
                stringBuilder.append( "0 " );
            } else {
                int distance = Math.abs( saveConfirmWords.get( 0 ) - i );
                for ( int j = 1; j < saveConfirmWords.size(); j++ ) {
                    int subDistance = Math.abs( saveConfirmWords.get( j ) - i );
                    distance = Math.min( distance, subDistance );
                }
                stringBuilder.append( distance ).append( " " );
            }
        }
        return stringBuilder.toString();
    }

    private static List<Integer> saveConfirmWords ( String confirmWord, char[] charArray ) {
        List<Integer> confirmWordsIndex = new ArrayList<>();
        for ( int i = 0; i < charArray.length; i++ ) {
            char c = charArray[i];
            if(Character.toString( c ).equals( confirmWord )) {
                confirmWordsIndex.add( i );
            }
        }
        return confirmWordsIndex;
    }

}
