package sgyj.inflearn.study.week2;

import java.util.Scanner;

public class Solution20 {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public void main(String[] args){
        Solution20 solution20 = new Solution20();
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int x : solution20.solution(n, arr)) System.out.print(x + " ");
    }
}
