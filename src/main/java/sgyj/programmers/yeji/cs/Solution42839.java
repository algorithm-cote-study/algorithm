package sgyj.programmers.yeji.cs;

import java.util.HashSet;
import java.util.Set;

public class Solution42839 {
    private static boolean[] visited;
    private static Set<Integer> answer = new HashSet<>();

    public static int solution(String numbers) {
        String[] numberStr = numbers.split("");
        int n = numberStr.length;
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            visited[i] = true;
            checkPrime(numberStr,i,n,numberStr[i],0);
        }
        return answer.size();
    }

    public static void checkPrime(String[] numberStr, int i, int n,String target, int count){
        if(i==n && count != n) i=0;
        if(i==n || count == n) return;
        if(!visited[i]){
            target += numberStr[i];
        }
        if(isPrime(Integer.valueOf(target))){
            answer.add(Integer.valueOf(target));
        }
        visited[i] = true;
        checkPrime(numberStr,i+1,n,target,count+1);
        visited[i] = false;
    }

    public static boolean isPrime(int target){
        boolean isPrime = true;
        if(target == 0 || target == 1) return false;
        for(int p=2; p<target; p++){
            if(target % p == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main ( String[] args ) {
        String numbers = "17";
        System.out.println(solution(numbers));
    }
}
