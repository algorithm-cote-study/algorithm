package sgyj.inflearn.yeji.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution7 {

    public static int[][] solution(int n, int[][] xy){
        int[][] result = new int[n][2];
        int t = 0;
        for(int j=0; j<n-1; j++){
            int point = 0;
            for(int i=n-1; i>t; i--){
                if(xy[0][i-1]>xy[0][i]){
                    swap(xy,i-1,i);
                }else if(xy[0][i-1]==xy[0][i]){
                    equalsSwap(xy,i-1,i);
                }
                point=i;
            }
            t = point;
        }
        for(int i=0; i<n; i++){
            result[i][0] = xy[0][i];
            result[i][1] = xy[1][i];
        }
        return result;
    }

    public static void swap(int[][] xy, int before, int now){
        int tmp = xy[0][before];
        xy[0][before] = xy[0][now];
        xy[0][now] = tmp;
        int tmp2 = xy[1][before];
        xy[1][before] = xy[1][now];
        xy[1][now] = tmp2;
    }

    public static void equalsSwap(int[][] xy, int before, int now){
        if(xy[1][before]>xy[1][now]){
            int tmp = xy[0][before];
            xy[0][before] = xy[0][now];
            xy[0][now] = tmp;
            int tmp2 = xy[1][before];
            xy[1][before] = xy[1][now];
            xy[1][now] = tmp2;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] xy = new int[2][n];
        for(int i=0; i<n; i++){
            int[] input = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
            xy[0][i] = input[0];
            xy[1][i] = input[1];
        }
        for(int[] i : solution(n, xy)){
            System.out.println(i[0]+ " "+i[1]);
        }
    }
}
