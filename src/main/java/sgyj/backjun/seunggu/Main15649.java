package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15649 {

    public static void main(String[] args) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] lines = reader.readLine().split(" ");
            int n = Integer.parseInt(lines[0]);
            int m = Integer.parseInt(lines[1]);
            int[] combination = new int[m+1];
            boolean[] visited = new boolean[n+ 1];
            StringBuilder stringBuilder = new StringBuilder();
            dfs(0,n, m, combination, visited, stringBuilder);
            System.out.println(stringBuilder);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dfs(int number, int depth, int limit, int[] combination, boolean [] visited, StringBuilder stringBuilder) {
        if(number == limit) {
            for (int i =0; i < number; i++) {
                stringBuilder.append(combination[i]).append(" ");
            }
            stringBuilder.append("\n");
            return;
        }
        for(int i=1; i<= depth; i++) {
            if(!visited[i]) {
                visited[i] = true;
                combination[number] = i;
                dfs(number+1, depth, limit, combination, visited, stringBuilder);
                visited[i] = false;
            }
        }
    }

}
