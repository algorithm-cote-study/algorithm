package sgyj.programmers.yeji.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// 기능개발
public class Solution42586 {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        for(int i=progresses.length-1; i>=0; i--){
            stack.push( new Node( progresses[i],speeds[i] ) );
        }

        int completedJob = 1;
        while ( !stack.isEmpty() ){
            Node curNode = stack.pop();
            if(curNode.progress<100){
                stack.push( curNode.updateProgress());
            }else{
                while(!stack.isEmpty() && stack.peek().progress + ( curNode.day * stack.peek().speed)>=100){
                    stack.pop();
                    completedJob++;
                }
                answer.add( completedJob );
                completedJob = 1;
            }

        }

        return answer.stream().mapToInt( Integer::valueOf ).toArray();
    }

    public static void main ( String[] args ) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        for(int s : solution( progresses,speeds )){
            System.out.print(s + " ");
        }
    }
}

class Node{
    int day;
    int progress;
    int speed;
    Node(int progress,int speed){
        this.progress = progress;
        this.speed = speed;
    }

    public Node updateProgress (){
        this.progress+=this.speed;
        this.day++;
        return this;
    }
}