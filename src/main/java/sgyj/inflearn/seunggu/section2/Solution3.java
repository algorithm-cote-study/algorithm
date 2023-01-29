package sgyj.inflearn.seunggu.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution3 {
    /**
     * @title : 가위 바위 보
     * @description : A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
     *                가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
     *                두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
     * @input : 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
     *          두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     *          세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     * @output : 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            System.out.println(solution( reader ));
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static String solution ( BufferedReader reader ) throws IOException {
        int count = Integer.parseInt( reader.readLine() );
        int[] a = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        int[] b = Arrays.stream( reader.readLine().split( " " ) ).mapToInt( Integer::parseInt ).toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < count; i++) {
            if( a[i] == b[i]) {
                stringBuilder.append( "D" );
            }else {
                stringBuilder.append( rockScissorsPaper( a[i], b[i]) );
            }
            stringBuilder.append( "\n" );
        }
        return stringBuilder.toString();
    }

    private static String rockScissorsPaper ( int a, int b ) {
        if( (a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            return "A";
        }
        return "B";
    }
}
