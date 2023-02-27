package sgyj.leetcode.yeji.section5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

// 841. Keys and Rooms
public class Solution841 {
    private static boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        visited = new boolean[n];
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int curNode = q.poll();
            for(int i=0; i<rooms.get(curNode).size(); i++){
                int target = rooms.get(curNode).get(i);
                if(!visited[target]){
                    q.offer(target);
                    visited[target] = true;
                }
            }
        }

        for(boolean v : visited){
            if(!v) return false;
        }
        return true;
    }
}
