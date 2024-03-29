package sgyj.inflearn.seunggu.section4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Solution5 {

    /**
     * @title : K번째 큰수
     * @description : 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
     *                현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
     *                기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
     *                만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
     * @input : 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
     * @output : 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
     */
    public static void main( String[] args ) {

        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(solution( reader ));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static int solution ( BufferedReader reader ) throws IOException {
        String[] line = reader.readLine().split(" ");
            int k = Integer.parseInt(line[1]);
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int lt = 0;
            int rt = 1;
            int size = array.length;
            List<Integer> list = new ArrayList<>();
        while( lt < size ) {
            int a = array[lt];
            for(int i= rt; i < size; i++) {
                int b = array[i];
                for(int j=i+1; j < size; j++) {
                    int c = array[j];
                    list.add( a + b + c);
                }
            }
            lt++;
            rt++;
        }
        return getNumberOfKIndex( list, k );
    }

    static int getNumberOfKIndex(List<Integer> list, int k) {
        list = list.stream().sorted( Comparator.reverseOrder() ).distinct().collect( Collectors.toList());
        if(list.size() < k) {
            return -1;
        }
        return list.get(k-1);
    }

}