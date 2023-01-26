package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main5597 {

    public static void main (String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = new int[31];
            for(int i=0; i <28; i++ ) {
                int number = Integer.parseInt(reader.readLine());
                array[number] = 1;
            }
            int count = 0;
            for(int i=1; i <= 30; i++) {
                if(count == 2) break;
                if(array[i] == 0) {
                    System.out.println(i);
                    count++;
                }
            }
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

}
