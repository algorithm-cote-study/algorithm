package sgyj.inflearn.yeji.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public List<Integer> solution( int input1, String input2){
        String[] splitInput2 = input2.split( " " );
        List<Integer> result = new ArrayList<>();
        result.add( Integer.valueOf( splitInput2[0] ) );
        for(int i=1; i<splitInput2.length; i++){
            int compare = Integer.parseInt( splitInput2[i-1] );
            int target = Integer.parseInt( splitInput2[i] );
            if(compare < target ){
                result.add( target);
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        Solution1 solution1 = new Solution1();
        int input1 = in.nextInt();
        in.nextLine();
        String input2 = in.nextLine();
        List<Integer> solution = solution1.solution( input1, input2 );
        for ( Integer integer : solution ) {
            System.out.print( integer + " ");
        }
    }
}
