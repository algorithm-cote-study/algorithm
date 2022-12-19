package sgyj.inflearn.study.week2;

import java.util.Scanner;

public class Solution17 {

    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i; j<=n; j=j+1){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution17 solution17 = new Solution17();
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        System.out.print(solution17.solution(n));
    }
}
