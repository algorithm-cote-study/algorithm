package sgyj.inflearn.yeji.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution68 {

    public static List<Integer> sumList = new ArrayList<>();

    public static void DFS(int max, int[] input,int target,int compare){
        if(compare>=max)return;
        if(input.length==target){
            sumList.add(compare);
        }else{
            DFS(max,input,target+1,compare+input[target]);
            DFS(max,input,target+1,compare);
        }
    }

    public static int solution(int c, int n, int[] input){
        int answer = 0;

        DFS(c,input,0,0);
        for(int s : sumList){
            if(c>=s && s>answer){
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] n = Arrays.stream( sc.nextLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] m = new int[n[1]];
        for(int i = 0; i<n[1]; i++){
            m[i] = sc.nextInt();
        }
        System.out.println(solution(n[0],n[1],m));
    }
}
