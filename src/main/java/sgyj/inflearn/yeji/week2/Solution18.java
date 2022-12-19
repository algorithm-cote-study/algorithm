package sgyj.inflearn.yeji.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution18 {

    /*
    * @description
    * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
    * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
    * 첫 자리부터의 연속된 0은 무시한다.
    * @input
    * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
    * 각 자연수의 크기는 100,000를 넘지 않는다.
    * @output
    * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
    * */
    private static List<Integer> solution(String[] input2){
        List<Integer> result = new ArrayList<>();

        for(String in : input2){
            StringBuilder s = new StringBuilder();
            s.append(Integer.valueOf( in ));
            s.reverse();
            int reverseInt = Integer.parseInt( s.toString() );
            if(reverseInt < 2) continue;
            boolean checkPrime = true;
            for(int i=2; i<reverseInt; i++){
                if(reverseInt % i == 0) checkPrime = false;
            }
            if(checkPrime) result.add( reverseInt );
        }

        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner( System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String[] input2 = in.nextLine().split( " " );
        List<Integer> solution = solution( input2 );
        for ( Integer integer : solution ) {
            System.out.print(integer + " " );
        }
    }
}
