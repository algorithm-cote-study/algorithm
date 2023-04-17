package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어의 갯수
public class Main1152 {

    public static void main ( String[] args ) {
        try(InputStreamReader inputStreamReader = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( inputStreamReader );
        ){
            int answer = 0;
            String[] input = br.readLine().split( " " );
            for(String s : input){
                String s1 = s.replaceAll( " ", "" );

                if(!s1.equals( "" )){
                    answer++;
                }
            }
            System.out.println(answer);

        }catch ( IOException ex){
            ex.printStackTrace();
        }
    }
}
