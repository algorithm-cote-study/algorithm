package sgyj.inflearn.seunggu.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {

    /**
     * @title : 올바른 괄호
     * @description : 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
     *                (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
     * @input : 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
     * @output : 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
     */
    public static void main(String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(solution5( reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader reader) throws IOException {
        String[] words = reader.readLine().split("");
        int size = words.length;
        int lt = 0;
        String temp = words[0];
        int right = 0;
        int left = 0;
        while(lt < size) {
            String now = words[lt];
            if(temp.equals( ")" ) && now.equals( "(" )) {
                if( right != left ) return "NO";
                right = 0;
                left = 0;
            }
            if(now.equals( "(" )) {
                right++;
            } else {
                left++;
            }
            temp = now;
            lt++;
        }
        return "YES";
    }

    public static String solution2(String[] words) {
        int lt = 0;
        int rt = 0;
        for ( String word : words ) {
            if ( word.equals( "(" ) ) {
                lt++;
            } else {
                rt++;
            }
        }
        if(lt == rt) {
            return "YES";
        }
        return "NO";
    }

    public static String solution3(String[] words) {
        int lt = 0;
        int rt = 0;
        for ( String word : words ) {
            if ( word.equals( "(" ) ) {
                lt++;
            } else {
                rt++;
            }
            if ( lt == rt ) {
                lt = 0;
                rt = 0;
            }
        }
        if(lt == rt) {
            return "YES";
        }
        return "NO";
    }

    public static String solution4(String[] words) {
        int start = 0;
        String temp = words[0];
        if ( temp.equals( ")" ) || words[words.length-1].equals( "(" )) {return "NO";}
        while(start < words.length) {
            if(words[start].equals("(") && !isRight( words, start )) return "NO";
            start++;
        }
        return "YES";
    }

    private static boolean isRight ( String[] words, int start ) {
        int lt = 0;
        int rt = 0;
        for(int i= start; i < words.length; i++) {
            String word = words[i];
            if(word.equals("(")) {
                lt++;
            } else {
                if( lt == rt ) return true;
                rt++;
            }
        }
        return false;
    }

    static String solution5 ( BufferedReader reader ) throws IOException {
        String[] words = reader.readLine().split("");
        Deque<String> deque = new ArrayDeque<>();
        for ( String word : words ) {
            if(word.equals( "(" )) {
                deque.add( word );
            } else {
                String peek = deque.peek();
                if(peek == null) return "NO";
                deque.pop();
            }
        }
        if(deque.isEmpty()) return "YES";
        return "NO";
    }
}