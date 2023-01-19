package sgyj.inflearn.yeji.week4;

import java.util.Scanner;
import java.util.Stack;

public class Solution40 {

    public static int solution(String[] input){
        int answer = 0;
        Stack<String> stack = new Stack();
        int lt = Integer.MIN_VALUE;
        int rt = Integer.MIN_VALUE;
        for(int i = 0;i<input.length; i++){
            if(input[i].equals("(")){
                lt = i;
                stack.push("(");
            }else{
                rt = i;
                if(rt-lt==1){
                    stack.pop();
                    answer+=stack.size();
                }else{
                    stack.pop();
                    answer+=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input.split("")));
    }
}
