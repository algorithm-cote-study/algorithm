package sgyj.programmers.yeji.stack;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// 같은 숫자는 싫어
public class Solution12906 {
    public static int[] solution(int []arr) {
        Deque<Integer> q = new ArrayDeque<>();
        for(int a : arr){
            if ( !q.isEmpty() ){
                if(q.peek() != a){
                    q.push( a );
                }
            }else{
                q.push( a );
            }

        }
        int[] answer = new int[q.size()];
        int i = q.size()-1;
        while(!q.isEmpty()){
            answer[i] = q.pop();
            i--;
        }
        return answer;
    }

    public static void main ( String[] args ) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for(int a : solution(arr)){
            System.out.print(a + " ");
        }
    }
}
