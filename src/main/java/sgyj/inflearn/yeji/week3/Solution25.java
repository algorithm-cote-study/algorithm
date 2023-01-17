package sgyj.inflearn.yeji.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution25 {

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public static String solution(BufferedReader reader) throws IOException {
        StringBuilder answer = new StringBuilder();
        int firstCount = Integer.parseInt( reader.readLine() );
        int[] firstArray = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int secondCount = Integer.parseInt( reader.readLine() );
        int[] secondArray = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();

        int firstIndex = 0;
        int secondIndex = 0;
        while ( firstIndex < firstCount && secondIndex < secondCount ){
            if(firstArray[firstIndex] < secondArray[secondIndex]){
                answer.append( firstArray[firstIndex] ).append( " " );
                firstIndex++;
            }else if(firstArray[firstIndex] > secondArray[secondIndex]){
                answer.append( secondArray[secondIndex] ).append( " " );
                secondIndex++;
            }else{
                answer.append( firstArray[firstIndex] ).append( " " );
                answer.append( secondArray[secondIndex] ).append( " " );
                firstIndex++; secondIndex++;
            }
        }

        if(firstIndex != firstCount){
            for(int i = firstIndex; i<firstCount; i++){
                answer.append( firstArray[i] ).append( " " );
            }
        }else if(secondIndex != secondCount){
            for(int i = secondIndex; i<secondCount; i++){
                answer.append( secondArray[i] ).append( " " );
            }
        }

        return answer.toString();
    }
}
