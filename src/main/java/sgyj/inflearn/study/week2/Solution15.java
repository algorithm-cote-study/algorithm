package sgyj.inflearn.study.week2;

import java.util.Scanner;

public class Solution15 {

    public static String solution(int n, int[] a, int[] b){
        String answer = "";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]){
                answer+="D";
            }else if(a[i] == 1 && b[i] == 3){
                answer+="A";
            }else if(a[i] == 2 && b[i] == 1){
                answer+="A";
            }else if(a[i] == 3 && b[i] == 2){
                answer+="A";
            }else{
                answer+="B";
            }
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        int[] input2 = new int[input1];
        int[] input3 = new int[input1];
        for(int i=0; i<input1; i++){
            input2[i] = in.nextInt();
        }
        for(int i=0; i<input1; i++){
            input3[i] = in.nextInt();
        }
        String solution = solution( input1, input2, input3 );
        System.out.println(solution);
    }
}
