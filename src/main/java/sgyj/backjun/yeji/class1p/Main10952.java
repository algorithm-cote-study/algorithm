package sgyj.backjun.yeji.class1p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// A+B - 5
public class Main10952 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( inputStreamReader );){
            StringBuilder answer = new StringBuilder();
            String line;
            while ( (line = br.readLine()) != null && !line.isBlank() ){
                int[] s = Arrays.stream(line.split( " " ) ).mapToInt( Integer::parseInt ).toArray();
                if(s[0]+s[1] != 0){
                    answer.append( s[0]+s[1] ).append( "\n" );
                }
            }
            System.out.println(answer);
        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
