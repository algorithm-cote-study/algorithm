package sgyj.inflearn.seunggu.section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution7 {


    private static int[] checked;

    /**
     * 원더랜드(최소스패닝트리)
     * @param args
     */
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            solution(reader);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private static void solution ( BufferedReader reader ) throws  IOException {
        String[] readers = reader.readLine().split( " " );
        int v = Integer.parseInt( readers[0] );
        int e = Integer.parseInt( readers[1] );
        checked = new int[v+1];
        for(int i=1; i<= v; i++) checked[i] = i;
        List<Distance> distances = new ArrayList<>();
        for(int i=0; i< e; i++) {
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            distances.add( Distance.of(array[0], array[1], array[2]) );
        }
        int answer = 0;
        Collections.sort(distances);
        for(Distance distance : distances){
            if(find(distance.getFrom()) != find( distance.getTo() )) {
                union(distance.getFrom(), distance.getTo());
                answer += distance.getCost();
            }
        }
        System.out.println(answer);
    }

    static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);
        if(findA != findB) checked[findA] = findB;
    }

    private static int find ( int v ) {
        if(checked[v] == v) return v;
        checked[v] = find(checked[v]);
        return checked[v];
    }

    static class Distance implements Comparable<Distance> {
        private final int from;
        private final int to;
        private final int cost;

        private Distance( int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public static Distance of( int from, int to, int cost ) {
            return new Distance( from, to, cost );
        }

        public int getFrom() {
            return this.from;
        }

        public int getTo() {
            return this.to;
        }

        public int getCost() {
            return this.cost;
        }

        @Override
        public int compareTo(Distance d) {
            return this.cost - d.cost;
        }
    }

}
