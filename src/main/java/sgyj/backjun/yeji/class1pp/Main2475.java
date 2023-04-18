package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 검증수
public class Main2475 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){

            int avg = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).map( a -> a*a ).sum();
            System.out.println(avg%10);

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
