package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10871 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){
            StringBuilder sb = new StringBuilder();
            int[] n = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            int[] input = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();

            for(int i=0; i<input.length; i++){

                if(n[1]>input[i]){
                    sb.append( input[i] ).append( " " );
                }
            }

            System.out.println(sb);

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }

}
