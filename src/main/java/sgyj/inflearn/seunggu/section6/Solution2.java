package sgyj.inflearn.seunggu.section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2 {


    /**
     * @title : 버블 정렬
     * @description : N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
     *                정렬하는 방법은 버블정렬입니다.
     * @input : 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
     *          두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
     * @output : 오름차순으로 정렬된 수열을 출력합니다.
     */
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution( reader ));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int n = Integer.parseInt( reader.readLine());
        int[] arr = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        for(int i=0; i<arr.length; i++) {
            int temp = arr[0];
            for(int j=1; j< arr.length - i; j++) {
                int temp2 = arr[j];
                if(temp > temp2) {
                    arr[j-1] = temp2;
                    arr[j] = temp;
                } else {
                    temp = temp2;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int temp : arr) {
            stringBuilder.append(temp).append(" ");
        }
        return stringBuilder.toString();
    }

}
