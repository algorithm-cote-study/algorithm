package sgyj.backjun.seunggu;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    private static int naver = 0;
    public static void main ( String[] args ) {

        new Solution(22);
        System.out.println( Arrays.toString( solution( new int[][]{ { 5, 10, 7 }, { 7, 5, 8 }, {8, 10, 3}, {6, 5, 7} }, new int[]{ 2, 4, 2, 4 } ) ) );
    }

    public Solution(){}
    public Solution(int naver) {


    }

    static {
        int size = 1;
    }

    static int[] solution(int[][] plans, int[] testdata) {
        List<Test> list = new ArrayList<>();
        for(int i=0; i< plans.length; i++) {
            list.add( new Test(i+1) );
        }


        for ( int data : testdata ) {
            Test test = list.get( data - 1 );
            int[] plan = plans[data - 1];
            for ( int j = 0; j < plan.length; j++ ) {
                if ( j == 0 ) test.score += plan[j] * 2;
                if ( j == 1 ) test.score += test.count + plan[j];
                if ( j == 2 ) test.score += Math.max( 1, plan[j] - test.count );
            }
            test.count++;
        }
        Collections.sort(list);

        int[] answer = new int[plans.length];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get( i ).index;
        }

        return answer;
    }

    static class Test implements Comparable<Test> {
        private final int index;
        private int score;
        private int count;

        public Test(int index) {
            this.index = index;
        }
        @Override
        public int compareTo(Test t){
            if(this.score == t.score) return this.index - t.index;
            return t.score - this.score;
        }
    }

}
