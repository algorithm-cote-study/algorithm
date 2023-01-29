package sgyj.inflearn.seunggu.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution73 {

    private static final long[] memoization = new long[10001];
    private static final int[][] memo = new int[35][35];
    /**
     * @title : 조합의 경우수(메모이제이션)
     * @description : 하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.
     *                nCr = n-1Cr-1 + n-1Cr
     * @input : 첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.
     * @output : 첫째 줄에 조합수를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            String[] lines = reader.readLine().split( " " );
            int n = Integer.parseInt( lines[0] );
            int r = Integer.parseInt( lines[1] );
            System.out.println(ncr( n,r ));
            System.out.println(recursion( n, r ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static long ncr(int n, int r) {
        return factorial( n, n, 1 ) / (factorial( n-r, n-r, 1 ) * factorial( r, r,1 ));
    }

    static long factorial(int n, int init, long sum) {
        if( memoization[init] != 0) {
            return memoization[init];
        }
        if(n == 0) {
            memoization[init] = sum;
            return sum;
        }
        sum *= n;
        return factorial( n-1, init, sum );
    }

    static int recursion(int n, int r) {
        if(n == r || r ==0 ) return 1;
        return recursion( n-1, r-1 ) + recursion( n-1, r );
    }

}
