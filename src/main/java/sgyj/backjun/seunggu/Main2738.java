package sgyj.backjun.seunggu;

import java.io.*;
import java.util.*;
public class Main2738 {

    public static void main( String[] args ) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = reader.readLine().split(" ");
            int firstCount = Integer.parseInt(line[0]);
            int secondCount = Integer.parseInt(line[1]);
            int[][] firstArray = new int[firstCount][secondCount];
            int[][] secondArray = new int[firstCount][secondCount];
            makeArray(firstArray, reader, firstCount);
            makeArray(secondArray, reader, firstCount);
            int[][] resultArray = new int[firstCount][secondCount];
            for(int i=0; i< firstCount; i++) {
                for(int j=0; j<secondCount; j++) {
                    resultArray[i][j] = firstArray[i][j] + secondArray[i][j];
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i< firstCount; i++) {
                for(int j=0; j<secondCount; j++) {
                    stringBuilder.append(resultArray[i][j]).append(" ");
                }
                stringBuilder.append("\n");
            }
            System.out.println(stringBuilder);

        }catch(Exception e ) {
            e.printStackTrace();
        }
    }

    private static void makeArray(int[][] array, BufferedReader reader, int count) throws IOException {
        for(int i=0; i< count; i++) {
            array[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    }

}
