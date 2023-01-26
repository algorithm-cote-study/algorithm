package sgyj.inflearn.seunggu.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution53 {
    /**
     * @title : 마구간 정하기(결정알고리즘)
     * @description : N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
     *                현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
     *                가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
     *                C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
     * @input : 첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
     *          둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
     * @output : 첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
     */
    public static void main (String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(solution(reader));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int solution(BufferedReader reader) throws IOException {
        String[] lines = reader.readLine().split(" ");
        int n = Integer.parseInt(lines[0]);
        int c = Integer.parseInt(lines[1]);
        int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        Arrays.sort(array);
        int lt = 1;
        int rt = array[n-1];
        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(count(array, mid) >=c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static int count(int[] array, int dist) {
        int cnt = 1;
        int ep =array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] - ep >= dist) {
                cnt++;
                ep = array[i];
            }
        }
        return cnt;
    }

}
