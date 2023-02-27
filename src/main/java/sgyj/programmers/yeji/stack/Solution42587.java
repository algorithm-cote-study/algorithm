package sgyj.programmers.yeji.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// 프린터
public class Solution42587 {

    private static int solution(int[] priorities, int location){
        int answer = 0;
        List<Priority> answerLocation = new ArrayList<>();
        int max = -1;
        Deque<Priority> q = new ArrayDeque<>();
        for(int i=0; i<priorities.length; i++){
            max = Math.max(max, priorities[i] );
            q.offer( new Priority( i,priorities[i] ) );
        }

        while ( !q.isEmpty() ){
            Priority priority = q.poll();
            if(priority.prior == max){
                answerLocation.add( priority );
                priorities[priority.location] = -1;
                max = -1;
                for(int i=0; i<priorities.length; i++){
                    max = Math.max( max, priorities[i] );
                }
            }else{
                q.offer( priority );
            }
        }

        for(int i = 0; i<answerLocation.size(); i++){
            if(answerLocation.get( i ).location == location){
                return i+1;
            }
        }

        return answer;
    }

    public static void main ( String[] args ) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }
}

class Priority{
    int location;
    int prior;
    Priority(int location,int prior){
        this.location = location;
        this.prior = prior;
    }
}