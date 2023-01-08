package sgyj.inflearn.seunggu.week4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Solution38 {
    public static void main (String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println( solution( reader ));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        int size = Integer.parseInt( reader.readLine());
        int[][] array = new int[size][size];
        for(int i=0; i<size; i++) {
            array[i] = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        }
        // deque 배열 생성
        List<Deque<Integer>> dequeList = new ArrayList<>();
        for ( int i=0; i<array.length; i++ ) {
            Deque<Integer> deque = new ArrayDeque<>();
            int [] arr = array[i];
            for ( int j = arr.length-1; j >= 0; j-- ) {
                if ( array[j][i] != 0 ) deque.push( array[j][i] );
            }
            dequeList.add( deque );
        }
        reader.readLine();
        int[] moveArray = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        Deque<Integer> deque = new ArrayDeque<>();
        int result = 0;
        for(int move : moveArray) {
            Deque<Integer> integerDeque = dequeList.get( move - 1 );
            if ( !integerDeque.isEmpty() ) {
                int number = integerDeque.pop();
                int compare = deque.isEmpty() ? 0 : deque.peek();
                if(number != compare){
                    deque.push(number);
                }
                else {
                    deque.pop();
                    result++;
                }
            }
        }
        return result * 2;
    }
}
