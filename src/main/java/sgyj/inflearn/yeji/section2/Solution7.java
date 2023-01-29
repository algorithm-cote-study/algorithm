package sgyj.inflearn.yeji.section2;

import java.util.Scanner;

public class Solution7 {

    private static int solution(String[] input){
        int answer = 0;
        int point = 0;
        int before = 0;
        for(int i=1; i<=input.length; i++){
            if(Integer.parseInt(input[before]) != 0){
                point++;
                answer += point;
            }else{
                point=0;
            }
            before++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String[] input2 = in.nextLine().split( " " );
        System.out.print(solution( input2 ));
    }
}
