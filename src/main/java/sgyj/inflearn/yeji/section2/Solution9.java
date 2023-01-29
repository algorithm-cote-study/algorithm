package sgyj.inflearn.yeji.section2;

import java.util.Scanner;

public class Solution9 {

    public static int solution(int n, int[][] input){
        int answer = 0;

        for(int i=0; i<n; i++){
            int index = 0;
            int garo = 0;
            int sero = 0;
            while (index < n){
                garo += input[i][index];
                sero += input[index][i];
                index++;
            }
            if(garo > sero && answer < garo) answer = garo;
            else if(garo < sero && answer < sero) answer = sero;
        }
        int compare1 = 0;
        int compare2 = 0;
        for(int i=0; i<n; i++){
            compare1 += input[i][i];
            compare2 += input[i][n-1-i];
        }
        if(compare1 > answer) answer = compare1;
        if(compare2 > answer) answer = compare2;
        return answer;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int[][] input = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                input[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution( n,input ));

    }
}
