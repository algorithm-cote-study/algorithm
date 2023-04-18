package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 기찍
public class Main2742 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){

            int n = Integer.parseInt(br.readLine());

            for(int i=n; i>0; i--){
                System.out.println(i);
            }

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
