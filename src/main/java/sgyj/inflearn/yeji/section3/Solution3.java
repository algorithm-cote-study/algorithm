package sgyj.inflearn.yeji.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution3 {

    public static void main(String[] args){
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in))){
            System.out.println(solution(reader));
        } catch ( IOException e){
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader reader) throws IOException {
        int[] fistInput = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] secondInput = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int n = fistInput[0];
        int k = fistInput[1];
        int startInput = IntStream.rangeClosed( 0,k-1 ).map( i -> secondInput[i] ).sum();
        int maxMoney = 0;
        int first = 0;
        int second = k;
        for(int i=0; i<n-k; i++){
            int compare =  startInput+secondInput[second]-secondInput[first];
            int max = Math.max( startInput,compare );
            maxMoney = Math.max( maxMoney, max );
            first++;
            second++;
            startInput = compare;
        }
        return  maxMoney;
    }


}
