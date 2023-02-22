package sgyj.programmers.hash;

import java.util.HashMap;
import java.util.Map;

// 완주하지 못한 선수
public class Solution42576 {
    private String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for(String part: participant){
            map.put(part,map.getOrDefault(part,0)+1);
        }
        for(String com : completion){
            map.put(com,map.get(com)-1);
        }
        for(String key : map.keySet()){
            if(map.get(key)>0) return key;
        }
        return answer;
    }

    public static void main ( String[] args ) {

    }
}
