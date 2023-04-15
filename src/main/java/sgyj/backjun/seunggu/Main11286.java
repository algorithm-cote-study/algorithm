package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main11286 {

    public static void main(String[] args) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            PriorityQueue<AbsNumber> queue = new PriorityQueue<>();
            int count = Integer.parseInt(reader.readLine());
            StringBuilder stringBuilder =new StringBuilder();
            for(int i=0; i<count; i++) {
                int num = Integer.parseInt(reader.readLine());
                if(num == 0) {
                    if(queue.isEmpty()) {
                        stringBuilder.append(0);
                    } else {
                        stringBuilder.append(queue.poll().num);
                    }
                    stringBuilder.append("\n");
                } else {
                    queue.offer(AbsNumber.of(num));
                }
            }
            System.out.println(stringBuilder);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class AbsNumber implements Comparable<AbsNumber> {
        private final int num;

        private AbsNumber(int num) {
            this.num = num;
        }

        public static AbsNumber of(int num) {
            return new AbsNumber(num);
        }

        @Override
        public int compareTo(AbsNumber a) {
            if(Math.abs(this.num) == Math.abs(a.num)) return this.num - a.num;
            return Math.abs(this.num) - Math.abs(a.num);
        }
    }

}
