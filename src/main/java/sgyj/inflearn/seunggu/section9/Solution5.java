package sgyj.inflearn.seunggu.section9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution5 {

    /**
     * @title       : 다익스트라 알고리즘
     * @description : 아래의 가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로 그램을 작성하세요. (경로가 없으면 Impossible를 출력한다)
     * @input : 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연 결정보와 거리비용이 주어진다.
     * @output : 1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력하세요.
     */
    private static int[] distance;
    private static List<List<Distance>> graph;

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader(System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        String[] lines = reader.readLine().split( " ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        distance = new int[m + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        graph  = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++) {
            int[] arr = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
            graph.get(arr[0]).add(Distance.of(arr[1], arr[2]));
        }
        daikstra( 1 );
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=2; i <=n ; i++) {
            if ( distance[i] != Integer.MAX_VALUE ) stringBuilder.append( i ).append( " : " ).append( distance[i] ).append( "\n" );
            else {stringBuilder.append( i ).append( " : " ).append( "impossible" ).append( "\n" );}
        }
        return stringBuilder.toString();
    }

    static void daikstra(int number) {
        Queue<Distance> queue = new PriorityQueue<>();
        queue.offer(Distance.of(number,0));
        distance[number] =  0;
        while(!queue.isEmpty()) {
            Distance dis = queue.poll();
            int now = dis.getNumber();
            int nowWeight = dis.getWeight();
            if(nowWeight > distance[now]) continue;
            for(Distance d : graph.get(now)) {
                if(distance[d.getNumber()] > nowWeight + d.getWeight()) {
                    distance[d.getNumber()] = nowWeight + d.getWeight();
                    queue.offer(Distance.of(d.getNumber(), nowWeight + d.getWeight()));
                }
            }
        }
    }


    static class Distance implements Comparable<Distance> {
        private final int number;
        private final int weight;
        List<Distance> children;

        private Distance( int number, int weight ) {
            this.number = number;
            this.weight = weight;
            children = new ArrayList<>();
        }

        public static Distance of( int number, int weight ) {
            return new Distance(number, weight);
        }

        public int getNumber() {
            return this.number;
        }

        public int getWeight() {
            return this.weight;
        }

        @Override
        public int compareTo(Distance d) {
            return this.weight - d.weight;
        }


    }

}
