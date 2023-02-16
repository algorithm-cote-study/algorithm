package sgyj.thisiscodingtest.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main ( String[] args ) {
        System.out.println( Arrays.toString( solution( 3, 5 ) ) );
    }

    static int n;
    static long k;
    static boolean[] visited;
    static int[] answer;
    static List<Integer> initArray;
    public static int[] solution(int a, int b) {
        n = a;
        k = b;
        visited = new boolean[n+1];
        answer = new int[n];
        initArray = new ArrayList<>();
        long sum= 1;
        for(int i=1; i <= n; i++) {
            sum *= i;
            initArray.add( i );
        }
        System.out.println(initArray);
        k--;

        int index = 0;
        while(n > 0) {
            sum /= n--;
            System.out.println(k/sum);
            answer[index++] = initArray.get((int)(k / sum));
            initArray.remove(((int)(k / sum)  ));
            k %= sum;
        }

        return answer;
    }

    static long multiple( long x, long m, int n ) {
        if( x == n + 1) return m;
        m = m * (x-1);
        return multiple( x+1, m, n );
    }

}
