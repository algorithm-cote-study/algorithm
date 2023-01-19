package sgyj.inflearn.yeji.week5;

import java.util.Scanner;
import java.util.Arrays;


class Solution48{
    // 중복확인
    // 중복 : D
    // 다를경우 : U

    public static void swap(int[] input,int before, int after){
        int tmp = input[before];
        input[before] = input[after];
        input[after] = tmp;
    }
    public static String solution(int n, int[] input){
        String answer = "U";
        int flag=0;
        for(int i = 0; i<input.length-1; i++){
            int target=flag;
            for(int j=input.length-1; j>flag; j--){
                if(input[j-1]==input[j]) return "D";
                if(input[j-1]>input[j]){
                    swap(input,j-1,j);
                }
                target = j;
            }
            flag = target;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.print(solution(n,input));
    }
}
