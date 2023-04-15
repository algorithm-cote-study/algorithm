package sgyj.backjun.yeji.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2920 : 음계
public class Main2920 {

    public static void main ( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        int[] s = Arrays.stream( br.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] compare = Arrays.copyOf( s, s.length );
        Arrays.sort( compare );
        if(Arrays.compare( s,compare ) == 0){
            System.out.println("ascending");
        }else{
            boolean flag = false;
            for(int i=0; i<s.length; i++){
                if(s[i] != compare[s.length-i-1]){
                    System.out.println("mixed");
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.println("descending");
            }
        }

    }
}
