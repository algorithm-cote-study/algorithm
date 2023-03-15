package sgyj.programmers.yeji.section4;

import java.util.Arrays;

public class Solution42748 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int c=0; c<commands.length; c++){
            int start = commands[c][0]-1;
            int end = commands[c][1];
            int target = commands[c][2]-1;

            int[] arr = Arrays.copyOfRange( array, start, end);
            Arrays.sort(arr);
            answer[c] = arr[target];
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2,5,3},{4,4,1},{1,7,3}
        };

        for(int s : solution(array,commands)){
            System.out.print(s +" ");
        }
    }
}
