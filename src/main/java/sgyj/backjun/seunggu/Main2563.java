package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2563 {

    private static final int[][] array = new int[100][100];

    public static void main (String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());
            for(int i=0; i<count; i++) {
                String[] numbers = reader.readLine().split(" ");
                fillArray(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
            }
            int fillArea = 0;
            for(int i=0; i<100; i++) {
                for(int j=0; j <100; j++) {
                    if(array[i][j] == 1) {
                        fillArea++;
                    }
                }
            }
            System.out.println(fillArea);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void fillArray(int x, int y) {
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                array[x+i][y+j] = 1;
            }
        }
    }

}
