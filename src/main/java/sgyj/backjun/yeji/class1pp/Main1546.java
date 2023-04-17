package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 평균
public class Main1546 {

    public static void main ( String[] args ) {
        try(InputStreamReader inputStreamReader = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( inputStreamReader );){

            int n = Integer.parseInt(br.readLine());
            int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            int max = Integer.MIN_VALUE;
            for(int i : input){
                max = Math.max( max,i );
            }

            double newScore = 0;
            for(int i=0; i<input.length; i++){
                newScore += ( (double) input[i]/ (double) max) * 100;
            }

            System.out.println(newScore/n);

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
