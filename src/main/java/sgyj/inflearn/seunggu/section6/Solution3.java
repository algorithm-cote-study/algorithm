package sgyj.inflearn.seunggu.section6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Solution3 {

    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) )) {
            System.out.println(solution( reader ));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int n = Integer.parseInt( reader.readLine() );
        int[] arr = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j;
            for(j= i-1; j >=0 && arr[j]>temp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int k : arr) {
            stringBuilder.append(k).append(" ");
        }
        return stringBuilder.toString();
    }

}
