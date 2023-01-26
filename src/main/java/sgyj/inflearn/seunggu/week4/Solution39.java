package sgyj.inflearn.seunggu.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
public class Solution39 {

    /**
     * @title : 후위식 연산(postfix)
     * @description : 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
     *                 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
     * @input : 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
     *          식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
     * @output : 연산한 결과를 출력합니다.
     */
    public static void main (String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution( reader ));

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        String lines = reader.readLine();
        Deque<Integer> characters = new ArrayDeque<>();
        char[] array = lines.toCharArray();
        for ( char c : array ) {
            if ( !Character.isDigit( c ) ) {
                int a = characters.pop();
                int b = characters.pop();
                int calNumber = calculateNumber( b, a, c );
                characters.push( calNumber );
            } else {
                characters.push( Character.getNumericValue( c ) );
            }
        }
        return characters.pop();
    }

    private static int calculateNumber(int a, int b, char c) {
        if(c == '*') {
            return a * b;
        }
        if(c == '+') {
            return a+b;
        }
        if(c == '-') {
            return a-b;
        }
        return a/b;
    }
}
