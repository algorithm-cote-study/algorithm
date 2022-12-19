package sgyj.inflearn.study.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution13 {
    public ArrayList<Integer> solution( int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add( arr[0] );
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) answer.add( arr[i] );
        }
        return answer;
    }

    public static void main(String[] args){
        Solution13 solution13 = new Solution13();
        Scanner kb = new Scanner( System.in );
        int n = kb.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++ ) {
            arr[i] = kb.nextInt();
        }
        for(int x : solution13.solution(n,arr)){
            System.out.print( x + " " );
        }
    }
}
