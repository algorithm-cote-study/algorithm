package sgyj.inflearn.yeji.section7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution8_2 {
    static int answer = 0;
    static int[] dis = {1,-1,5};
    static int[] ch;
    static Queue<Integer> Q = new LinkedList<>();

    public static int solution(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer( s );
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i =0; i<len; i++){
                int x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx=x+dis[j];
                    if(nx==e) return L+1;
                    if(nx >=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        Q.offer( nx );
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int[] n = Arrays.stream( sc.nextLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        System.out.println(solution(n[0],n[1]));
    }

}
