package sgyj.programmers.yeji.dfsbfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution43164 {

    private static Map<String,List<String>> ticketMap = new HashMap<>();
    private static PriorityQueue<String> pQ = new PriorityQueue<>();

    public static String[] solution(String[][] tickets) {

        for(String[] ticket : tickets){
            List<String> getList = ticketMap.getOrDefault( ticket[0], new ArrayList<>() );
            getList.add( ticket[1] );
            ticketMap.put( ticket[0] ,getList);
        }

        List<String> answer = new ArrayList<>();
        pQ.offer( "ICN" );

        while ( !pQ.isEmpty() ){
            int len = pQ.size();
            for(int i=0; i<len; i++){
                String cur = pQ.poll();
                answer.add( cur );
                if(!answer.contains( cur )) {
                    List<String> strings = ticketMap.get( cur );
                    for ( String string : strings ) {
                        pQ.offer( string );
                    }
                }
            }
        }

        return answer.toArray( new String[0] );
    }

    public static void main ( String[] args ) {
        String[][] tickets = {
            {"ICN", "JFK"},{"HND", "IAD"},{"JFK", "HND"}
        };

        for(String ticket : solution(tickets)){
            System.out.print(ticket + " ");
        }
    }
}

class AirPort implements Comparable<AirPort>{
    String airPort;
    boolean visited;

    AirPort(String airPort){
        this.airPort = airPort;
    }

    @Override
    public int compareTo ( AirPort o ) {
        return this.airPort.compareTo( o.airPort );
    }

    public void visited (){
        this.visited = true;
    }
}