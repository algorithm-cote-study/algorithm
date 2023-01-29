package sgyj.inflearn.yeji.section7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution8 {
    public static int solution(int s, int e){
        int answer = s < e ? (e-s)/5 : 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer((5*answer)+s);
        while(!q.isEmpty()){
           int len = q.size();
           for(int i=0; i<len; i++){
               int compare = q.poll();
               if(compare != e){
                   q.offer( compare+1 );
                   q.offer( compare-1 );
                   q.offer( compare+5 );
               }else{
                   return answer;
               }
           }
           answer++;
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] n = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        System.out.println(solution(n[0],n[1]));
    }
}
