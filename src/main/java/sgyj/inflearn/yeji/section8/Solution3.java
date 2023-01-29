package sgyj.inflearn.yeji.section8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution3 {

    protected static List<Integer> sumList = new ArrayList<>();

    public static void DFS(int n,int max, int[][] input, int i,int t, int sum){
        if(t>max) return;
        if(i==n){
            sumList.add(sum);
        }else{
            DFS(n,max,input,i+1,t+input[i][1],sum+input[i][0]);
            DFS(n,max,input,i+1,t,sum);
        }

    }

    public static int solution(int i, int max, int[][] input){
        int answer = 0;

        DFS(i,max,input,0,0,0);

        for(int sum : sumList){
            if(sum>answer){
                answer = sum;
            }
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] n = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        int[][] m = new int[n[0]][2];
        for(int i = 0; i<n[0]; i++){
            m[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(solution(n[0],n[1],m));
    }
}
