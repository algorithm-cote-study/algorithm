package sgyj.inflearn.yeji.week2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution7 {

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        int[] ints = IntStream.rangeClosed( 1, input1 ).toArray();
        int answer = 0;
        for(int i=0; i<ints.length; i++){
            if(ints[i] == 0) continue;

            for(int j=2*i; j<ints.length; j+=i){
                ints[j] = 0;
            }

        }
        for ( int anInt : ints ) {
            if(anInt != 0) answer++;
        }
        System.out.println( "solution = " + answer );
    }
}
