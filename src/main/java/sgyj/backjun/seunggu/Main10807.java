package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main10807 {
    public static void main (String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = Integer.parseInt(reader.readLine());
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int compareNumber = Integer.parseInt(reader.readLine());
            long count = Arrays.stream(array).filter(s -> s == compareNumber).count();
            System.out.println(count);
        }catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
