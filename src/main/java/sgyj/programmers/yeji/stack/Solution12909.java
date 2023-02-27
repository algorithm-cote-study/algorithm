package sgyj.programmers.yeji.stack;

import java.util.ArrayDeque;
import java.util.Deque;

// 올바른 괄호
public class Solution12909 {

    private static boolean solution(String s){
        Deque<Character> stack =  new ArrayDeque<>();
        boolean answer = true;
        for(Character c : s.toCharArray()){
            if(c == '('){
                stack.push( c );
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main ( String[] args ) {
        String s = "(()()))";

        System.out.println(solution(s));
    }
}
