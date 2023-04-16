package sgyj.backjun.yeji.class1p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 아스키코드
public class Main10951 {

    public static void main ( String[] args ) {
        try( InputStreamReader in = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( in );){

            System.out.println(br.read());

        }catch ( IOException ex ){
            ex.printStackTrace();
        }

    }
}
