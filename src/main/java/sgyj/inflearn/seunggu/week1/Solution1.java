package sgyj.inflearn.seunggu.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {

    /**
     * @description : 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     *                대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
     * @input : 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
     *          문자열은 영어 알파벳으로만 구성되어 있습니다.
     * @output : 첫 줄에 해당 문자의 개수를 출력한다.
     */
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in))) {
            String word = reader.readLine();
            String findChar = reader.readLine();
            String[] words = word.split( "" );
            int cnt = 0;
            for ( String s : words ) {
                if(s.equalsIgnoreCase( findChar )) cnt++;
            }
            System.out.println(cnt);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

}
