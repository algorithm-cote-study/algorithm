package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 상수
public class Main2908 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){

            int[] s = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
            int a = reverse(s[0]);
            int b = reverse(s[1]);

            if(a<b){
                System.out.println(b);
            }else{
                System.out.println(a);
            }



        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }

    private static int reverse ( int number ){
        int result = 0;

        while ( number != 0 ){
            result = result * 10 + (number%10);
            number/=10;
        }

        return result;
    }
}
