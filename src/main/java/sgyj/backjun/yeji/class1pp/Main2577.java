package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 숫자의 개수
public class Main2577 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){

            int A = Integer.parseInt( br.readLine() );
            int B = Integer.parseInt( br.readLine() );
            int C = Integer.parseInt( br.readLine() );
            Map<String,Integer> map = new HashMap<>();
            for(String key : String.valueOf(A*B*C).split( "" )){
                map.put( key, map.getOrDefault( key,0 )+1 );
            }

            for(int i=0; i<10; i++){
                System.out.println( map.getOrDefault( String.valueOf( i ), 0 ) );
            }


        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
