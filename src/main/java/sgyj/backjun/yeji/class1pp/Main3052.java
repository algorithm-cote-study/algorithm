package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main3052 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){
            Set<Integer> distinctNum = new HashSet<>();
            for(int i=0; i<10; i++){
                  distinctNum.add(Integer.parseInt( br.readLine() ) % 42);
            }

            System.out.println(distinctNum.size());

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
