package sgyj.inflearn.yeji.section5;

import java.util.Scanner;
import java.util.Stack;


class Solution4 {
    // 후위식 연산
    public static int solution(String[] input){
        Stack<Integer> stack = new Stack();

        for(String i : input){
            if(isNumeric(i)){
                stack.push(Integer.parseInt(i));
            }else{
                stack.push(checkNum(stack.pop(),stack.pop(), i));
            }
        }
        return stack.pop();
    }

    public static boolean isNumeric(String i){
        try{
            Integer.parseInt(i);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    public static int checkNum(int stack1, int stack2, String target){
        if(target.equals("+")){
            return stack2+stack1;
        }else if(target.equals("-")){
            return stack2-stack1;
        }else if(target.equals("*")){
            return stack2*stack1;
        }
        return stack2/stack1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input.split("")));
    }

}