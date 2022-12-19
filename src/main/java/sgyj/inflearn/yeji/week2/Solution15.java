package sgyj.inflearn.yeji.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution15 {
    // 1, 2
    // 2, 3
    // 3, 1
    // 2, 1
    // 3, 2
    // 1, 3
    public List<String> solution( int input1, String[] input2, String[] input3){
        List<String> result = new ArrayList<>();

        for(int i = 0; i< input1; i++){
            int A = Integer.parseInt(input2[i]);
            int B = Integer.parseInt( input3[i] );
            if( A< B){
                if(B == 3 && A == 1){
                    result.add( "A" );
                }else{
                    result.add( "B" );
                }
            }else if(A>B){
                if(B == 1 && A == 3){
                    result.add( "B" );
                }else{
                    result.add( "A" );
                }
            }else{
                result.add("D");
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String[] input2 = in.nextLine().split( " " );
        String[] input3 = in.nextLine().split( " " );
        Solution15 solution15 = new Solution15();
        List<String> solution = solution15.solution( input1, input2, input3 );
        for ( String s : solution ) {
            System.out.println( s );
        }
    }
}
