package sgyj.inflearn.seunggu.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {

    /**
     * @description : N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
     * @input : 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
     *          두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
     * @output : N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
     */
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in))) {
            int number = Integer.parseInt( reader.readLine() );
            for ( int i = 0; i < number; i++ ) {
                String word = reader.readLine();
                StringBuilder builder = new StringBuilder(word);
                System.out.println(builder.reverse());
            }
        }catch ( IOException e ) {
            e.printStackTrace();
        }
    }

}
