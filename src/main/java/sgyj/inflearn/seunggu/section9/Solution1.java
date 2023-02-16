package sgyj.inflearn.seunggu.section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Solution1 {

    /**
     * @title : 씨름 선수
     * @description : 현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다.
     *                현수는 각 지원자의 키와 몸무게 정보를 알고 있습니다.
     *                현수는 씨름 선수 선발 원칙을 다음과 같이 정했습니다.
     *                “A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가
     *                존재하면 A지원자는 탈락하고, 그렇지 않으면 선발된다.”
     *                N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇 명의 선수를 선발할 수 있는지 알아내는 프로그램을 작성하세요.
     * @input : 첫째 줄에 지원자의 수 N(5<=N<=30,000)이 주어집니다.
     *          두 번째 줄부터 N명의 흰돌 능력치와 검은돌 능력치 정보가 차례로 주어집니다.
     *          각 선수의 흰돌능력치가 모두 다르고, 검은돌 능력치도 모두 다릅니다. 능력치 값은 1,000,000이하의 자연수입니다.
     * @output : 첫째 줄에 바둑 선수로 뽑히는 최대 인원을 출력하세요.
     */
    public static void main ( String[] args ) {
        try ( BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ) {
            int answer = solution( reader );
            System.out.println(answer);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    static int solution ( BufferedReader reader ) throws IOException {
        int count = Integer.parseInt( reader.readLine());
        int answer = 0;
        int[][] array = new int[count][2];
        for(int i=0; i<count;i++) {
            array[i] = Arrays.stream( reader.readLine().split( " ")).mapToInt( Integer::parseInt).toArray();
        }
        for(int i=0; i<count; i++) {
            int[] arr = array[i];
            int x = arr[0];
            int y = arr[1];
            boolean flag = true;
            for(int j=0; j<count; j++) {
                if(i != j && array[j][0] > x && array[j][1] > y ) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                answer++;
            }
        }
        return answer;
    }

}
