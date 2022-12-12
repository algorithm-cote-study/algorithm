package sgyj.inflearn.yeji.week1;

import java.util.Scanner;

public class Solution10 {
    // fkdgkjdflkgjljslgjkfldjlkfdg f
    // 0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2
    public int[] solution ( String s, String t ) {
        int[] answer = new int[s.length()];
        int index = 0;
        int before = s.indexOf( t );
        for(int i=0; i<s.length(); i++){
            if(t.equals( String.valueOf( s.charAt( i ) ))){
                answer[i] = 0;
                while ( index < i ){
                    if(index <= before){
                        answer[index] = i-index;
                    }else{
                        answer[index] = Math.min( Math.abs( index - before ),Math.abs( i - index ) );
                    }
                    index++;
                }
                before = i;
            }
        }
        if(before != s.length()){
            int target = before + 1;
            int n = 0;
            for(int i=target; i<s.length(); i++){
                ++n;
                answer[i] = n;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        String[] input =   in.nextLine().split( " " );
        Solution10 solution10 = new Solution10();
        int[] solution = solution10.solution( input[0], input[1] );
        for ( int i : solution ) {
            System.out.print( i + " " );
        }
    }
}
