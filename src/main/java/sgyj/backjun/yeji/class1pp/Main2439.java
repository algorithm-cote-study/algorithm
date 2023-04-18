package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2439 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){

            int n = Integer.parseInt(br.readLine());

            for(int i=1; i<=n; i++){
                System.out.println(" ".repeat( n-i ) + ("*".repeat( i )));
            }

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
