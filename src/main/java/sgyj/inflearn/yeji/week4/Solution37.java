package sgyj.inflearn.yeji.week4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution37 {
    // 괄호문자제거
    public static String solution(String input){
        StringBuilder answer = new StringBuilder();
        Stack<String> stack = new Stack();
        int i = 0;
        int length = input.length();
        while(i<length){
            stack.push(String.valueOf(input.charAt(i)));
            if(stack.peek().equals(")")){
                stack.pop();
                while(!stack.peek().equals("(")){
                    stack.pop();
                }
                stack.pop();
            }
            i++;
        }
        while(!stack.isEmpty()){
            answer.append(stack.pop());
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        String input = sc.nextLine();

        System.out.println(solution(input));
    }
}
