package sgyj.inflearn.seunggu.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution37 {

    /**
     * @title : 괄호문자제거
     * @description : 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
     * @input : 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     * @output : 남은 문자만 출력한다.
     */
    public static void main(String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution( reader ));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split( "");
        Deque<String> deque = new ArrayDeque<>();
        for(String line : lines) {
            if(line.equals( ")" )) {
                String temp = "";
                while(!temp.equals( "(" )) {
                    temp = deque.pop();
                }
            } else {
                deque.push( line );
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for ( String s : deque ) {
            stringBuilder.append( s );
        }
        return stringBuilder.reverse().toString();
    }
}