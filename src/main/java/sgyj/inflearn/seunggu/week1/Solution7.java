package sgyj.inflearn.seunggu.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution7 {

    /**
     * @title : 회문 문자열
     * @description : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
     *                문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
     *                단 회문을 검사할 때 대소문자를 구분하지 않습니다.
     * @input : 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
     * @output : 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
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
        StringBuilder reverseWord = new StringBuilder( word ).reverse();
        if(word.equalsIgnoreCase( reverseWord.toString() )) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
