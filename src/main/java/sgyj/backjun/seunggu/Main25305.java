package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main25305 {

    public static void main( String[] args ) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] scores = reader.readLine().split(" ");
            int number = Integer.parseInt(scores[0]);
            int cutLine = Integer.parseInt(scores[1]);
            List<Integer> array = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).boxed().sorted( Comparator.reverseOrder() ).collect( Collectors.toList());

            System.out.println(array.get( cutLine-1 )) ;
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

}
