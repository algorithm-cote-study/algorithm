package sgyj.inflearn.seunggu.section6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Solution1 {


    /**
     * @title : 선택 정렬
     * @description : N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
     *                정렬하는 방법은 선택정렬입니다.
     * @input : 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
     *          두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
     * @output : 오름차순으로 정렬된 수열을 출력합니다.
     */
    public static void main ( String[] args ) {
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String solution = solution( reader );
            System.out.println(solution);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        reader.readLine();
        int[] arr = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            int temp = arr[i];
            int minVal = Integer.MAX_VALUE;
            for(int j=i; j<arr.length; j++) {
                if(minVal > arr[j]) {
                    minVal = arr[j];
                    minIndex = j;
                }
            }
            arr[i] = minVal;
            arr[minIndex] = temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int temp : arr) {
            stringBuilder.append(temp).append(" ");
        }
        return stringBuilder.toString();
    }

}
