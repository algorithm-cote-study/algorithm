package sgyj.leetcode.yeji.section3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

// valid parentheses 올바른 괄호
public class Solution20 {

    private static boolean isValid(String s){
        Deque<Character> q = new ArrayDeque<>();
        Map<Character,Character> map = new HashMap<>();
        map.put( '(' , ')');
        map.put( '{' , '}');
        map.put( '[' , ']');

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                q.push( c );
            }else{
                if(q.isEmpty()) return false;
                if(map.get( q.peek() ) == c){
                    q.pop();
                }
            }
       }

        return q.isEmpty();
    }

    public static void main ( String[] args ) {
        String s = "))";
        System.out.println(isValid(s));
    }

}

