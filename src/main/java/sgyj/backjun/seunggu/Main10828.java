package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main10828 {

    public static void main(String[] args) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(reader.readLine());
            StringBuilder stringBuilder = new StringBuilder();
            Deque<String> deque = new ArrayDeque<>();
            for(int i = 0; i < count; i++) {
                String line = reader.readLine();
                if(line.contains(" ")) {
                    deque.push(line.split(" ")[1]);
                } else {
                    switch (line) {
                        case "top" -> {
                            if (deque.isEmpty()) stringBuilder.append(-1);
                            else stringBuilder.append(deque.peek());
                        }
                        case "size" -> stringBuilder.append(deque.size());
                        case "pop" -> {
                            if (deque.isEmpty()) stringBuilder.append(-1);
                            else stringBuilder.append(deque.pop());
                        }
                        default -> stringBuilder.append(deque.isEmpty() ? 1 : 0);
                    }
                    stringBuilder.append("\n");
                }
            }
            System.out.println(stringBuilder);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
