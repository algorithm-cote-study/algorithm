package sgyj.programmers.seunggu.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main42895 {

    public static void main ( String[] args ) {
        System.out.println(solution( 5, 12 ));
    }

    static int solution(int n, int number) {
        if ( n == number) return 1;
        Set<Integer>[] sets = new Set[8];

        for(int i=0; i<sets.length; i++) {
            sets[i] = new HashSet<>();
            sets[i].add( Integer.parseInt( Integer.toString( n ).repeat( ( i + 1 ) ) ) );
        }

        for(int i=1; i<sets.length;i++) {
            for(int j = 0; j < i; j++) {
                for(int op1 : sets[j]) {
                    for(int op2 : sets[i-j-1]) {
                        sets[i].add( op1+op2 );
                        sets[i].add( op1-op2 );
                        sets[i].add( op1*op2 );
                        if(op2 != 0) sets[i].add( op1/op2 );
                        if(op1 != 0) sets[i].add( op2/op1 );

                    }
                }
            }
            if(sets[i].contains( number )) return i+1;
        }
        return 0;
    }
}
