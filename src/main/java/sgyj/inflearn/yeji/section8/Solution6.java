package sgyj.inflearn.yeji.section8;

import java.util.Arrays;
import java.util.Scanner;

public class Solution6 {
    // 조합수
    protected static int answer = 0;

    public static void DFS(int total, int member, int i,int count){
        if(count > member) return;
        if(i==total+1){
            if(member==count){
                answer++;
            }
        }else{
            DFS(total,member,i+1,count++);
            DFS(total,member,i+1,count);
        }
    }

    public static int solution(int[] m){
        int total = m[0];
        int member = m[1];
        DFS(total,member,1,0);
        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] m = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        System.out.println(solution( m ));
    }
}
