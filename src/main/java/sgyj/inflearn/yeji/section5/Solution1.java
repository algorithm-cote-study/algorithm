package sgyj.inflearn.yeji.section5;

import java.util.Scanner;
import java.util.Stack;

public class Solution1 {

    // 올바른 괄호
    public static String solution(String input){
        Stack<String> compare = new Stack<>();
        int i = 1;
        compare.push( String.valueOf( input.charAt( 0) ) );
        while(i < input.length()){
            String key = String.valueOf(input.charAt(i));
            if(!compare.isEmpty()){
                if(!compare.peek().equals(key) && key.equals( ")" )){
                    compare.pop();
                }else{
                    compare.push( key );
                }
            }else{
                compare.push(key);
            }
            i++;
        }
        return compare.isEmpty()?"YES":"NO";
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(solution(input));
    }

}
