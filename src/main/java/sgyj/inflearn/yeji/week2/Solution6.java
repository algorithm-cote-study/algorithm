package sgyj.inflearn.yeji.week2;

import java.util.Scanner;

public class Solution6 {

    public int checkInteger(int target, int currentIndex, int result, int[] checkValue){
        result += checkValue[target];
        if(target == 0 || currentIndex - target == 2){
            return result;
        }
        return checkInteger( target-1, currentIndex, result, checkValue );
    }

    // 1 1 2 3 5 8 13 21 34 55
    public int[] solution(int input1){
        int[] result = new int[input1];
        result[0] = 1;
        for(int i = 1; i<input1; i++){
            result[i] = checkInteger(i-1,i,result[i],result);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        Solution6 solution6 = new Solution6();
        int[] solution = solution6.solution( input1 );
        for ( int integer : solution ) {
            System.out.print( integer +" ");
        }
    }
}
