package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1182 {

    private static int answer;
    public static void main(String[] args) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] lines = reader.readLine().split(" ");
            int sum = Integer.parseInt(lines[1]);
            answer = 0;
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            dfs(0, 0, sum, array);
            System.out.println(sum == 0? answer-1 : answer);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void dfs(int number, int total, int sum, int[] array) {
        if(number == array.length-1) {
            if(total == sum) answer++;
            return;
        }
        dfs(number+1, total + array[number], sum, array);
        dfs(number+1, total, sum, array);

    }

}
