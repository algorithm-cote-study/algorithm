package sgyj.inflearn.yeji.section2;

import java.util.Scanner;

public class Solution2 {

    public int solution(int input1, String[] input2){
        int answer = 1;
        int compare = Integer.parseInt( input2[0] );
        for(int i=1; i<input2.length; i++){
            int target = Integer.parseInt( input2[i] );
            if(compare < target){
                answer++;
                compare = target;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String[] input2 = in.nextLine().split( " " );
        Solution2 solution2 = new Solution2();
        System.out.println( solution2.solution( input1, input2 ) );
    }
}
