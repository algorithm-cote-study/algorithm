package sgyj.inflearn.yeji.section6;

import java.util.Scanner;
import java.util.*;

public class Solution9 {
    // 뮤직비디오
    public static int count ( int[] arr, int capacity ){
        int cnt = 1;
        int sum = 0; // 현재 녹음되고 있는 DVD에 차지하고 있는 용량
        for(int x: arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }else{
                sum+=x;
            }
        }

        return cnt;
    }

    public static int solution(int n, int m, int[] input){
        int answer = 0;
        int lt = Arrays.stream( input ).max().getAsInt();
        int rt = Arrays.stream( input ).sum();

        while ( lt<=rt ){
            int mid = (lt+rt)/2;
            if(count(input,mid)<=m){
                answer = mid;
                rt = mid-1;
            }
            else{
                lt=mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] n = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n[0],n[1],input));
    }

}

