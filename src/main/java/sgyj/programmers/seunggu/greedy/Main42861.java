package sgyj.programmers.seunggu.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main42861 {

    static int[] unf;

    public static int solution(int n, int[][] costs) {
        int answer = 0;
        unf = new int[n];
        for(int i=0; i<unf.length; i++) unf[i] = i;
        List<Island> list = new ArrayList<>();
        for(int i=0; i<costs.length; i++) {
            int[] cost = costs[i];
            list.add(Island.of(cost[0], cost[1], cost[2]));
        }
        Collections.sort( list);
        for ( Island island : list ) {
            if ( find( island.start ) != find( island.end ) ) {
                union( island.start, island.end );
                answer += island.cost;
            }
        }
        return answer;
    }

     private static int find ( int v ) {
        if(unf[v] == v) return v;
        unf[v] = find(unf[v]);
        return unf[v];
    }

    private static void union ( int a, int b ) {
        int findA = find(a);
        int findB = find(b);
        if(findA <= findB) unf[findB] = findA;
		else unf[findA] = findB;

    }

    static class Island implements Comparable<Island> {

        private final int start;
        private final int end;
        private final int cost;

        private Island( int start, int end, int cost ) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        public static Island of( int start, int end, int cost ) {
            return new Island( start, end, cost );
        }

        @Override
        public int compareTo(Island i) {
            return this.cost - i.cost;
        }
    }

}
