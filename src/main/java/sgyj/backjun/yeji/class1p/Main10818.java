package sgyj.backjun.yeji.class1p;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 최소, 최대
public class Main10818 {

    public static void main ( String[] args ) {
        try(InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader( in );){

            int n = Integer.parseInt( br.readLine() );
            int min =  Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int[] s = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();

            for(int r : s){
                min = Math.min( r, min );
                max = Math.max( r,max );
            }

            System.out.println(min + " " + max);

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
