package sgyj.inflearn.seunggu.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution37 {

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