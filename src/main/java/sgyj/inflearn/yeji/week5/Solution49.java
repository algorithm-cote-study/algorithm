package sgyj.inflearn.yeji.week5;

import java.util.Scanner;
import java.util.Arrays;


class Solution49{
    // 장난꾸러기
    // 9
    // 120 125 152 130 135 135 143 127 160
    public static int[] solution(int n, int[] input){
        int[] result = new int[2];
        int index=0;
        int[] compareInput = new int[input.length];
        System.arraycopy( input,0,compareInput,0,input.length );
        Arrays.sort(compareInput);
        for(int i=0; i<input.length; i++){
            if(compareInput[i]!=input[i]){
                result[index] = i+1;
                index++;
            }
        }
        return result;
    }

    public static void swap(int[] input, int before, int now){
        int tmp = input[before];
        input[before] = input[now];
        input[now] = tmp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i : solution(n,input)) System.out.print( i + " ");
    }
}
