package sgyj.backjun.seunggu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main14791 {


    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int result = 0;
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] rains = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Deque<Integer> deque = new ArrayDeque<>();
            int startIndex = 0;
            int height = rains[startIndex];
            for(int i=0; i<rains.length; i++) {
                if(height <= rains[i]) {
                    height = rains[i];
                    startIndex = i;
                } else {
                    break;
                }
            }
            int end = startIndex;
            for(int i=startIndex; i<rains.length; i++) {
                if(height <= rains[i]) {
                    result += calculateRain(deque, height);
                    height = rains[i];
                    end = i;
                    deque = new ArrayDeque<>();
                } else {
                    deque.add(rains[i]);
                }
            }
            deque = new ArrayDeque<>();
            startIndex = rains.length-1;
            height = rains[startIndex];
            for(int i=rains.length-1; i >= 0; i--) {
                if(height <= rains[i]) {
                    height = rains[i];
                    startIndex = i;
                } else {
                    break;
                }
            }

            for(int i=startIndex; i >= end; i--) {
                if(height <= rains[i]) {
                    result += calculateRain(deque, height);
                    height = rains[i];
                    deque = new ArrayDeque<>();
                } else {
                    deque.add(rains[i]);
                }
            }


            System.out.println(result);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int calculateRain(Deque<Integer> deque, int height) {
        int answer = 0;
        while(!deque.isEmpty()) {
            answer += (height - deque.pop());
        }
        return answer;
    }

}
