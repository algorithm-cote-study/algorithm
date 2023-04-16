package sgyj.backjun.yeji.class1p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main11720 {

    public static void main ( String[] args ) {
        try(InputStreamReader in = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( in );){

            br.readLine();
            int result = Arrays.stream( br.readLine().split( "" ) ).mapToInt( Integer::parseInt ).sum();
            System.out.println(result);

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
