package sgyj.inflearn.yeji.section8;

import java.util.*;

public class Solution4 {
    // 동전교환
    public static int solution(int n, int[] m, int r){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        int max = Arrays.stream( m ).max().getAsInt();
        Q.offer(max);
        int L = 1;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i<len; i++){
                int t = Q.poll();
                if(t > r) continue;
                if(t != r){
                    for ( int k : m ) {
                        Q.offer( t + k );
                    }
                }else{
                    return L;
                }
            }
            L++;
        }
        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] m = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = sc.nextInt();
        System.out.println(solution(n,m,r));
    }
}
