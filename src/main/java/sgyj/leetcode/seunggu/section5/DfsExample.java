package sgyj.leetcode.seunggu.section5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DfsExample {

    private static Map<String, Boolean> visited;
    private static Map<String, List<String>> graph;
    public static void main ( String[] args ) {
        visited = new LinkedHashMap<>();


        graph = new HashMap<>();
        makeGraph();
        int number = 10 >> 1;
        dfs("A");
        StringBuilder stringBuilder = new StringBuilder();
        for ( Entry<String, Boolean> entry : visited.entrySet() ) {
            stringBuilder.append( entry.getKey() ).append( " " );
        }
        System.out.println(stringBuilder);
    }

    private static void makeGraph () {
        List<String> list = List.of("B", "D", "E");
        graph.put( "A", list );
        list = List.of( "A", "C", "D");
        graph.put( "B", list );
        list = List.of( "B");
        graph.put( "C", list );
        list = List.of( "A", "B");
        graph.put( "D", list );
        list = List.of( "A" );
        graph.put( "E", list );
    }

    public static void dfs(String s) {
        visited.put( s, true );
        List<String> nodes = graph.get( s );
        for(String node : nodes) {
            if(visited.get( node ) == null) {
                dfs( node );
            }
        }
    }



}
