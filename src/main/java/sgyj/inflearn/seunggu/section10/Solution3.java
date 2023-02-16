package sgyj.inflearn.seunggu.section10;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Solution3 {

    private static int[] dp;
    public static void main( String[] args )  {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ){
            int count = Integer.parseInt(reader.readLine());
            dp = new int[count+1];
            Arrays.fill( dp, 1 );
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int answer = 0;
            for(int i=1; i<array.length; i++) {
                int number = array[i];
                for(int j=i-1; j >= 0; j--) {
                    int compareNumber = array[j];
                    if(number > compareNumber) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }

                answer = Math.max(answer, dp[i]);
            }
            System.out.println(answer);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}
