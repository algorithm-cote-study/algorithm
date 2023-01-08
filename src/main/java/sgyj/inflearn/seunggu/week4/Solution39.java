package sgyj.inflearn.seunggu.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
public class Solution39 {
    public static void main (String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
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
            System.out.println(characters.pop());

        }catch (IOException e) {
            e.printStackTrace();
        }
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
