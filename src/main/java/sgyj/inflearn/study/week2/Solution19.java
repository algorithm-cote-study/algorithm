package sgyj.inflearn.study.week2;

import java.util.Scanner;

public class Solution19 {

    public int solution(int n, int[] arr){
        int answer = 0, cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                answer+=cnt;
            }else{
                cnt=0;
            }
        }

        return answer;
    }

    public void main(String[] args){
        Solution19 solution19 = new Solution19();
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print(solution19.solution(n, arr));
    }
}
