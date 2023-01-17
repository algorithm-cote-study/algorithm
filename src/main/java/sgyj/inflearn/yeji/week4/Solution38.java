package sgyj.inflearn.yeji.week4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Solution38{
    // 크레인 인형뽑기
    public static int solution(int n,int m,int[][] inputArray,int[] inputM){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<inputM.length; i++){
            int targetIndex=inputM[i]-1;
            int j = 0;
            while(j < n){
                int compare = inputArray[j][targetIndex];
                if(compare != 0){
                    if(!stack.isEmpty() && stack.peek() == compare){
                        answer+=2;
                        stack.pop();
                    }else{
                        stack.push( compare );
                    }
                    inputArray[j][targetIndex] = 0;
                    break;
                }else{
                    j++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] inputArray = new int[n][n];
        for(int i = 0; i<n; i++){
            inputArray[i] = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        }
        int m = sc.nextInt();
        sc.nextLine();
        int[] inputM = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n,m,inputArray,inputM));
    }
}
