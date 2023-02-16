package sgyj.thisiscodingtest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            int[] numbers = Arrays.stream(reader.readLine().split( " " )).mapToInt( Integer::parseInt ).toArray();
            int m = numbers[1];
            int k = numbers[2];
            List<Integer> numberList = Arrays.stream( reader.readLine().split( " " ) )
                                          .mapToInt( Integer::parseInt )
                                          .boxed()
                                          .sorted( Comparator.reverseOrder() )
                                          .toList();
            int answer = 0;
            for(int i=0; i<m; i++) {
                if(i % (k+1) == 0) answer += numberList.get( 1 );
                else answer += numberList.get( 0 );
            }
            System.out.println(answer);

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    void solution( BufferedReader reader ) throws IOException {
        int[] numbers = Arrays.stream(reader.readLine().split( " " )).mapToInt( Integer::parseInt ).toArray();
        int n = numbers[0];
        int m = numbers[1];
        int k = numbers[2];
        numbers = Arrays.stream(reader.readLine().split( " " )).mapToInt( Integer::parseInt ).toArray();
        Arrays.sort(numbers);
        int first = numbers[n-1];
        int second = numbers[n-2];

        int count = (m / (k+1)) * k; // 가장 큰 수가 더해지는 횟수
        // k번을 반복하고 2번째 수를 한번 더하니까 k+1만큼이 반복된다.
        count += m % (k + 1);   // 나눈 수가 딱 떨어지지 않는다면 나머지 수도 더해줘야 하기 때문에 나머지 수를 더해준다.

        int answer = 0;
        answer += (count) * first;
        answer += (m - count) * second;
        System.out.println(answer);

    }
}
