package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main1927 {

    public static void main(String[] args) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int count = Integer.parseInt(reader.readLine());
            StringBuilder stringBuilder =new StringBuilder();
            for(int i=0; i<count; i++) {
                int num = Integer.parseInt(reader.readLine());
                if(num == 0) {
                    if(queue.isEmpty()) {
                        stringBuilder.append(0);
                    } else {
                        stringBuilder.append(queue.poll());
                    }
                    stringBuilder.append("\n");
                } else {
                    queue.offer(num);
                }
            }
            System.out.println(stringBuilder);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

}
