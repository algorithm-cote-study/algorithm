package sgyj.inflearn.seunggu.section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution4 {

    /**
     * @title : 최대 수입 스케쥴(PriorityQueue 응용문제)
     * @description : 현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해왔다. 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
     *                각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케쥴을 짜야 한다.
     *                단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.
     * @input : 첫 번째 줄에 자연수 N(1<=N<=10,000)이 주어지고, 다음 N개의 줄에 M(1<=M<=10,000)과 D(1<=D<=10,000)가 차례로 주어진다.
     * @output : 첫 번째 줄에 최대로 벌 수 있는 수입을 출력한다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader(System.in ) ) ) {
            solution( reader );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        int count = Integer.parseInt( reader.readLine());
        Queue<Integer> lectureQueue = new PriorityQueue<>(Collections.reverseOrder());
        List<Lecture> lectures = new ArrayList<>();
        for(int i=0; i<count; i++) {
            int[] array = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
            lectures.add(Lecture.of(array));
        }
        lectures.sort( Collections.reverseOrder() );
        Lecture lecture = lectures.get( 0 );
        int days = lecture.getDay();
        int answer = 0;
        while(days != 0) {
            int finalDays = days;
            lectures.forEach( l -> {
                if(l.getDay() == finalDays) {
                    lectureQueue.add( l.getCost() );
                }
            } );
            if(!lectureQueue.isEmpty()) answer += lectureQueue.poll();
            days--;
        }
       return answer;
    }

    static class Lecture implements Comparable<Lecture> {

        private final int cost;
        private final int day;

        private Lecture( int cost, int day ) {
            this.cost = cost;
            this.day = day;
        }

        public static Lecture of ( int[] array ) {
            return new Lecture( array[0], array[1] );
        }

        public int getCost() {
            return this.cost;
        }

        public int getDay () {
            return this.day;
        }

        @Override
        public int compareTo(Lecture l) {
            if( this.day == l.day ) return this.cost - l.cost;
            return this.day - l.day;
        }

    }
}
