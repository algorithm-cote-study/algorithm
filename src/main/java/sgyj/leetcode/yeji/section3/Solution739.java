package sgyj.leetcode.yeji.section3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution739 {

    private static int[] dailyTemperatures(int[] temperatures){
        Deque<TempDate> q = new ArrayDeque<>();
        int len = temperatures.length;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            while(!q.isEmpty() && q.peek().temp < temperatures[i]){
                TempDate tempDate = q.pop();
                answer[tempDate.date] = i-tempDate.date;
            }
            q.push( new TempDate( temperatures[i],i ) );
        }
        return answer;
    }

    public static void main ( String[] args ) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        for(int a : dailyTemperatures(temperatures)){
            System.out.print(a + " ");
        }
    }
}

class TempDate{
    int temp;
    int date;

    TempDate(int temp, int date){
        this.temp = temp;
        this.date = date;
    }

}
