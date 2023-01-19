package sgyj.backjun.seunggu;

import java.io.*;
import java.util.*;

public class Main2566 {

    public static void main( String[] args ) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[][] array = new int[9][9];
            for(int i=0; i<9; i++) {
                array[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            int max = Integer.MIN_VALUE;
            String location = "";
            for(int i=0; i<array.length; i++) {
                int[] arr = array[i];
                for(int j=0; j<arr.length; j++) {
                    int number = arr[j];
                    if(number > max) {
                        max = number;
                        location = (i+1) + " " + (j+1);
                    }
                }
            }
            System.out.println(max);
            System.out.println(location);
        }catch(Exception e ) {
            e.printStackTrace();
        }
    }

}
