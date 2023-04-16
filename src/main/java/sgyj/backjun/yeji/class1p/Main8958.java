package sgyj.backjun.yeji.class1p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX퀴즈
public class Main8958 {

    public static void main ( String[] args ) {
        try(InputStreamReader in = new InputStreamReader( System.in);
        BufferedReader br = new BufferedReader( in );){

            int n = Integer.parseInt(br.readLine());
            int[] answer = new int[n];

            for(int i=0; i<n; i++){
                answer[i] = solution(br.readLine().split( "" ));
            }

            for ( int a : answer ){
                System.out.println(a);
            }

        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }

    private static int solution(String[] input){
        int result = 0;

        int n = 1;
        for(String in : input){
            if("O".equals( in )){
                result += n;
                n++;
            }else{
                n = 1;
            }
        }

        return result;
    }

}
